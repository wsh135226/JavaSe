package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo10 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "胡歌,40", "彭于晏,39", "张艺兴,27", "张翰,36", "沈腾,39", "蔡徐坤,30");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "杨幂,37", "欧亚娜娜,32", "张小斐,27", "刘亦菲,36", "杨紫,27", "邓家佳,30");

        //需求1：男明星只需要名字为3个字的
        Stream<String> stream1 = list1.stream().filter(s -> s.split(",")[0].length() == 3);
        //stream1.forEach(System.out::println);


        //需求2:女演员只需要姓杨的，并且不要第一个
        //s表示流中的每一个数据,即集合中的一个个元素
        Stream<String> stream2 = list2.stream().filter(s -> s.split(",")[0].startsWith("杨")).
                filter(s -> !s.equals(list2.get(0)));//不是集合的第一个元素
        //stream2.forEach(System.out::println);

        //需求3：将上述过滤后的男女演员的名字合并到一起
        Stream<String> stream3 = Stream.concat(stream1, stream2);
        //stream3.map(s -> s.split(",")[0]).forEach(System.out::println);

        //需求4：将合并后的演员信息封装称演员对象（Actor）

        //获取流中的数据，并放入map集合中
        Map<String, Integer> map = stream3.collect(Collectors.toMap(s -> s.split(",")[0],
                s -> Integer.parseInt(s.split(",")[1])));

        ArrayList<Actor> list3 = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String key : set) {
            Actor actor = new Actor();
            //System.out.println(s);
            actor.setName(key);
            actor.setAge(map.get(key));
            //需求5：将Actor对象放入集合中，并打印在控制台
            list3.add(actor);
        }

        System.out.println(list3);

    }
}
