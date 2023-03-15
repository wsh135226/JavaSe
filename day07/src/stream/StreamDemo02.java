package stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo02 {

    public static void main(String[] args) {
        //1.单列集合获取Stream流
        
        //创建单列集合对象
        /*ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");*/
        //Stream<String> s1 = list.stream();
        //获取Stream流中的每一个数据（遍历）
        /*s1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s表示流中的每一个数据
                System.out.print(s+" ");
            }
        });*/

        //简化上面的匿名内部类
        //s表示流中的每一个数据
        //list.stream().forEach(s -> System.out.println(s));


        //双列集合获取Stream流

        //创建双列集合对象
        /*HashMap<String,Integer> hm = new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        hm.put("eee",555);*/

        //将双列集合转为单列集合
        //Set<String> set = hm.keySet();
        //s表示每一个键
        //set.stream().forEach(s -> System.out.println(s));

        //Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        //s表示每一个键值对
        //entries.stream().forEach(s-> System.out.println(s));

        //数组获取Stream流
        //int[] arr = {1,2,3,4,5};
        //通过Arrays工具类获取
        //Arrays.stream(arr).forEach(s-> System.out.println(s));


        //零散数据获取Stream流
        //前提：数据的类型必须保持一致
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    }
}
