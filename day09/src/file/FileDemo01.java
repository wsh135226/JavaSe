package file;

import java.io.File;

public class FileDemo01 {

    public static void main(String[] args) {
        //根据路径创建File对象，即通过字符串表示的路径所创建的对象
        String pathname = "C:\\Users\\Administrator\\Desktop\\user.txt";
        File f1 = new File(pathname);
        //System.out.println(f1);

        //根据父级路径和子级路径创建对象
        //以上面的路径为例：
        //父级路径：C:\Users\Administrator\Desktop
        //子级路径：user.txt
        String parent = "C:\\Users\\Administrator\\Desktop";
        String child = "user.txt";
        File f2 = new File(parent,child);
        //System.out.println(f2);

        //根据父级路径对应的对象和子级路径创建对象
        File parent2 = new File("C:\\Users\\Administrator\\Desktop");
        String child2 = "user.txt";
        File f3 = new File(parent2,child);
        System.out.println(f3);
    }
}
