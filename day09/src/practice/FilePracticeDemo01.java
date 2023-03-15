package practice;

import java.io.File;
import java.io.IOException;

public class FilePracticeDemo01 {

    public static void main(String[] args) throws IOException {
        //1.需求：在当前模块下的aaa文件夹中创建a.txt文件
        File file = new File("D:\\JAVADemo\\JavaSe\\day09\\aaa");
        //判断是否有aaa这个文件夹
        if (!file.exists()) {
            file.mkdir();
        }

        //2.将父级路径和子级路径进行拼接
        File src = new File(file, "a.txt");
        System.out.println(src);
        if (!src.exists()){
            boolean b = src.createNewFile();
            if (b) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }

    }
}

