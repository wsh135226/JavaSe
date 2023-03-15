package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo07 {

    public static void main(String[] args) {
        //collect:收集流中的数据，并放入集合中

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "郭靖-15", "张三丰-16", "张强-17", "张无忌-18", "黄蓉-19", "阿朱-20", "段誉-21", "王语嫣-22");

        //放到List集合中
        List<String> list2 = list1.stream().collect(Collectors.toList());
        //System.out.println(list2);

        //放到Set集合中
        Set<String> set = list1.stream().collect(Collectors.toSet());
        //System.out.println(set);

        //放到map集合中
        Map<String, Integer> map = list1.stream().collect(Collectors.toMap(

                /*
                 *tomap():
                 * 参数一：表示键的生成规则
                 * 参数二：表示值的生成规则
                 *
                 *第一个参数：
                 * Function的第一个泛型类型：指流中的数据的具体类型
                 * Function的第二个泛型类型：指map集合中键的具体类型
                 * 形参表示流中的每一个数据
                 * 返回值类型为键的具体类型
                 * 方法体：生成键的规则
                 * 返回值：已经生成的键
                 *
                 *
                 * 第二个参数：
                 * Function的第一个泛型类型：指流中的数据的具体类型
                 * Function的第二个泛型类型：指map集合中值的具体类型
                 * 形参表示流中的每一个数据
                 * 返回值类型为值的具体类型
                 * 方法体：生成值的规则
                 * 返回值：已经生成的值
                 * */


                //以姓名为键，以后面的数字为值
                //注意：键不能重复

                new Function<String, String>() {//map集合的键
                    @Override
                    public String apply(String s) {
                        String[] arr = s.split("-");
                        String key = arr[0];
                        return key;
                    }
                }, new Function<String, Integer>() {//map集合的值
                    @Override
                    public Integer apply(String s) {
                        String[] arr = s.split("-");
                        String key = arr[1];
                        int result = Integer.parseInt(key);
                        return result;
                    }
                }


                )


        );

        //lambda表达式写法
        Map<String, Integer> map2 = list1.stream().collect(Collectors.toMap(
                s -> s.split("-")[0]//键的生成规则
                ,
                s -> Integer.parseInt(s.split("-")[1])//值的生成规则
        ));

        //打印集合
        System.out.println(map2);


    }
}
