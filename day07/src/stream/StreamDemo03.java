package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo03 {

    public static void main(String[] args) {
        /*
        filter():过滤
        limit()：获取前面的元素
        skip()：跳过前面的元素
        * */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"郭靖","张三丰","张强","张无忌","袁华","黄蓉","阿朱","段誉","王语嫣");

        //创建Stream流对象,过滤以张开头的名字
        //Stream<String> stream1 = list.stream().filter((String s) -> s.startsWith("张"));
        //遍历经过过滤后的集合（实际上是遍历流）,集合中的数据并不会改变
        //stream1.forEach(System.out::println);
        //使用链式编程
        //list.stream().filter((String s) -> s.startsWith("张")).forEach(System.out::println);

        //list.stream().limit(3).forEach(System.out::println);//获取前面的3个元素

        //list.stream().skip(3).forEach(System.out::println);//跳过前面3过元素，打印后面的元素

        //练习：获取"张三丰","张强","张无忌"这3个元素
        list.
                stream().
                skip(1).//先跳过第一个元素
                limit(3).//再获取前面三个元素
                forEach(System.out::println);
    }
}
