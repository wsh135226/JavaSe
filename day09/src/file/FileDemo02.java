package file;

import java.io.File;

public class FileDemo02 {

    public static void main(String[] args) {
        //演示File判断方法

        File f1 = new File("D:\\JAVADemo\\a.txt");
        //判断文件或文件夹是否存在
        System.out.println(f1.exists());//true
        //判断是否是一个文件
        System.out.println(f1.isFile());//true
        //判断是否是一个文件夹
        System.out.println(f1.isDirectory());//false

        System.out.println("====================================");

        File f2 = new File("D:\\JAVADemo\\aaa");
        //判断文件或文件夹是否存在
        System.out.println(f2.exists());//true
        //判断是否是一个文件
        System.out.println(f2.isFile());//false
        //判断是否是一个文件夹
        System.out.println(f2.isDirectory());//true
    }
}
