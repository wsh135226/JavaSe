package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo06 {

    public static void main(String[] args) {


        /*
        foreach():遍历元素
        count():统计元素个数
        toArray():收集流中的数据，并放入数组中
        * */


        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"郭靖","张三丰","张强","张无忌","张无忌","黄蓉","阿朱","段誉","王语嫣");

        //list1.stream().forEach(System.out::println);

        //long count = list1.stream().count();
        //System.out.println(count);

        //Object[] objects = list1.stream().toArray();
        //System.out.println(Arrays.toString(objects));

        //1.形参为具体类型的数组，如String类型
        //2.int value:为元素的个数
        //3.返回值：具体类型的数组，和泛型保持一致
        //4.方法体就是创建一个数组对象，长度为value
        //5.toArray方法的参数的作用：负责创建一个指定类型的数组
        //6.toArray方法的底层：就是获取流里的每一个数据，并把这些数据放到创建大的数组中
        //toArray方法的的返回值：就是一个装着流里所有数据的数组
        /*String[] strArr = list1.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/

        //lambda表达式写法
        String[] strArr = list1.stream().toArray(value -> new String[value]);

        //遍历数组
        System.out.println(Arrays.toString(strArr));



    }
}
