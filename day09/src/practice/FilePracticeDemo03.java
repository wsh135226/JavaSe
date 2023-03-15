package practice;

import java.io.File;

public class FilePracticeDemo03 {

    public static void main(String[] args) {
        //File src = new File("D:\\");
        getRoots();
    }

    public static void getRoots(){
        //获取所有的盘符
        File[] f = File.listRoots();
        for (File file : f) {
            getFile(file);
        }
    }

    public static void getFile(File src) {
        File[] files = src.listFiles();
        //做非空判断
        if (files != null) {
            //当遇到没有权限访问的文件夹时，会返回null
            for (File file : files) {
                //1.如果遍历到的是文件
                if (file.isFile() && file.getName().endsWith("avi")) {
                    System.out.println(file);
                } else {
                    //如果是文件夹，那么就继续遍历，知道没有子级文件夹即可
                    //file表示的是子级路径上的文件或文件夹
                    getFile(file);
                }
            }
        }
    }
}
