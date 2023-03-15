package practice;

import java.io.File;

public class FilePracticeDemo04 {

    public static void main(String[] args) {
        File src = new File("D:\\JAVADemo\\ddd");
        deleteDirectory(src);
    }

    public static void deleteDirectory(File src){
        File[] files = src.listFiles();
        for (File file : files) {//file表示src中的所有文件和文件夹
            //如果是文件，就直接删掉
            if (file.isFile()){
                src.delete();
            }else {
                //如果是文件夹，就递归
                deleteDirectory(file);
            }
        }
        src.delete();
    }
}
