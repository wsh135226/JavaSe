package practice;

import java.io.File;

public class FilePracticeDemo02 {

    public static void main(String[] args) {
        File f1 = new File("D:\\JAVADemo\\aaa");
        File f2 = new File("D:\\JAVADemo\\bbb");
        //调用方法
        System.out.println(getFile(f1));//true
        System.out.println(getFile(f2));//false
    }

    public static Boolean getFile(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            //判断
            if (f.getName().endsWith("avi")){
                return true;
            }
        }
        return false;
    }
}
