package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class FileDemo03 {

    public static void main(String[] args) {
        //演示File的获取方法

        //1.获取文件大小(单位：字节)
        File f1 = new File("D:\\JAVADemo\\a.txt");
        //细节1：这个方法不能获取文件夹的大小，如果想要获取文件夹大小，只能将文件夹中的所有文件的大小进行累加
        //细节2：如果我们想要的单位是G、M，那么可以不断的除以1024
        System.out.println(f1.length());

        System.out.println("==============================");

        //2.获取文件或文件夹的绝对路径
        //File f2 = new File("D:\\JAVADemo\\a.txt");
        File f2 = new File("D:\\JAVADemo\\aaa");
        //System.out.println(f2.getAbsolutePath());//D:\JAVADemo\a.txt
        System.out.println(f2.getAbsolutePath());//D:\JAVADemo\aaa

        System.out.println("==============================");

        //3.获取定义文件或文件夹是使用的路径(就是原样输出定义文件对象时使用的路径)
        //File f3 = new File("D:\\JAVADemo\\aaa");
        File f3 = new File("JavaSe\\day09\\a.txt");
        //System.out.println(f3.getPath());//D:\JAVADemo\aaa
        System.out.println(f3.getPath());//JavaSe\day09\a.txt

        System.out.println("==============================");

        //4.获取文件的名称
        //当是文件时，获取名称和后缀   当是文件夹时，只有名称
        //File f4 = new File("D:\\JAVADemo\\a.txt");
        File f4 = new File("D:\\JAVADemo\\aaa");
        //System.out.println(f4.getName());//a.txt
        System.out.println(f4.getName());//aaa


        System.out.println("==============================");


        //5.获取文件或文件夹最后的修改时间(单位：毫秒)
        File f5 = new File("D:\\JAVADemo\\a.txt");
        System.out.println(f5.lastModified());//1678776669847

        System.out.println("==============================");

        //练习：将上述毫秒值转成字符串格式的时间：如xxxx年xx月xx日  xx时xx分xx秒
        //1.JDK7的方式
        /*Date date = new Date(1678776669847l);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日 HH时:mm分:ss秒");
        String result = sdf.format(date);
        System.out.println(result);//2023年03月14日 14时:51分:09秒*/

        //2.JDK8的方式
        Instant instant = Instant.ofEpochMilli(1678776669847l);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY年MM月dd日 HH时:mm分:ss秒");
        String result = formatter.format(dateTime);
        System.out.println(result);//2023年03月14日 14时:51分:09秒
    }
}
