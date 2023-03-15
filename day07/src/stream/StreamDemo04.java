package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo04 {

    public static void main(String[] args) {
        /*
        distinct():去重
        细节：如果集合存的是自定义对象，那么需要重写hashCode()和equlas(),
        因为distinct()是依赖这两个方法进行去重的
        concat():合并流
        * */

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"郭靖","张三丰","张强","张无忌","张无忌","黄蓉","阿朱","段誉","王语嫣");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("阿紫");
        list2.add("扫地僧");

        //list1.stream().distinct().forEach(System.out::println);

        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);
    }
}
