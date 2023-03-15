package file;

import java.io.File;

public class FileDemo05 {

    public static void main(String[] args) {

        /*
        细节：
        delete():如果删除的是文件，那么直接删除，不走回收站
        如果删除的是空文件夹，那么直接删除，不走回收站
        如果删除的是有内容的文件夹，则删除失败
         */

        //File file = new File("D:\\JAVADemo\\a.txt");
        //File file = new File("D:\\JAVADemo\\aaa");
        File file = new File("D:\\JAVADemo\\bbb");
        //System.out.println(file.delete());//true
        //System.out.println(file.delete());//false
        System.out.println(file.delete());//true
    }
}
