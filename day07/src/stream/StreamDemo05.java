package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo05 {

    public static void main(String[] args) {
        //map():转换流中的数据类型

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "郭靖-15", "张三丰-16", "张强-17", "张无忌-18", "黄蓉-19", "阿朱-20", "段誉-21", "王语嫣-22");


        //需求：获取元素中的数字并打印在控制台上


        /*list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //1.先将每个元素进行切割
                String[] strArr = s.split("-");//按照 - 将每个元素进行分割 切割得到如：[郭靖, 15]
                //2.获取数组中1索引的元素
                String str = strArr[1];
                //3.将字符串转为int
                int resutlt = Integer.parseInt(str);
                //4.将结果返回
                return resutlt;
            }
        }).forEach(s-> System.out.println(s));*/

        /*
        Integer.parseInt(s.split("-")[1])
        相当于
        //1.先将每个元素进行切割
         String[] strArr = s.split("-");//按照 - 将每个元素进行分割 切割得到如：[郭靖, 15]
        //2.获取数组中1索引的元素
         String str = strArr[1];
        //3.将字符串转为int
         int resutlt = Integer.parseInt(str);：
         */
        //s依次表示流里的每一个数据
        list1.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
    }
}
