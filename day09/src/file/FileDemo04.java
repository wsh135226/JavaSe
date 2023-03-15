package file;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {

    public static void main(String[] args) throws IOException {

        //1.创建文件
        File f1 = new File("D:\\JAVADemo\\ddd\\c.txt");//ddd目录不存在
        //细节1：当创建的文件已经存在时，那么方法返回false，表示创建失败
        //细节2：这个方法只能创建文件，不能创建文件夹，
        //细节3：如果创建的文件没有指定后缀名，那么这个创建出来的文件就没有后缀名
        //细节4：如果父级目录不存在，那么会报异常：java.io.IOException: 系统找不到指定的路径。
        //boolean b1 = f1.createNewFile();
        //System.out.println(b1);

        //2.创建文件夹(目录)
        File f2 = new File("D:\\JAVADemo\\aaa\\fff\\eee\\bdg");
        //细节1：Windows中路径时唯一的，如果文件的路径已经存在（即这个路径的ccc这个名字已经存在），则创建失败
        //细节2：这个方法只能创建单级目录
        boolean b2 = f2.mkdir();
        //System.out.println(b2);//false

        //3.创建文件夹(目录):创建多级目录
        File f3 = new File("D:\\JAVADemo\\aaa\\fff\\eee\\bdg");
        //细节：既可以创建多级目录，也可以创建单级目录
        boolean b3 = f3.mkdirs();
        System.out.println(b3);//true
    }
}
