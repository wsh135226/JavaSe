package file;

import java.io.File;
import java.util.Arrays;

public class FileDemo07 {

    public static void main(String[] args) {

        //1.获取系统中所有的盘符
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));
    }
}
