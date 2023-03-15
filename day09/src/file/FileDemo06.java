package file;

import java.io.File;

public class FileDemo06 {

    public static void main(String[] args) {

        File file = new File("D:\\JAVADemo\\aaa");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
