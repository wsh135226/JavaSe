package practice;

import java.io.File;

public class FilePracticeDemo05 {

    public static void main(String[] args) {
        File file = new File("D:\\JAVADemo\\aaa");
        System.out.println(getFileSize(file));
    }

    public static long getFileSize(File src){
        long count = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            //如果是文件，那么就直接进行累加
            if (file.isFile()){
                count = count + file.length();
            }else {
                //如果是文件夹
                count = count + getFileSize(file);
            }
        }
        return count;
    }
}
