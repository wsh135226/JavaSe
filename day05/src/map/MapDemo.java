package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("欧阳克", "穆念慈");

        //第一种遍历方式：通过键获取值

        //1.获取集合的键（将map集合中的键放到一个单列集合中
        //Set<String> keys = map.keySet();
        //遍历Set集合中map集合的键
        /*for (String key : keys) {
            //System.out.println(key);
            //通过键获取值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }*/

        //利用迭代器方式遍历单列集合
        /*Iterator<String> i = keys.iterator();
        while (i.hasNext()){
            //遍历出所有的键
            String key = i.next();
            //通过键获取值
            String value = map.get(key);
            //打印输出键和值
            System.out.println(key + "=" + value);
        }*/


        //第二种遍历方式：直接获取键值对对象，遍历键值对对象，获取键和值

        //1.获取键值对对象，并且将键值对对象放到一个set集合中
        //Map.Entry:因为Entry是Map的一个内部接口，使用的话要么导包，要么使用Map.Entry
        //Set<Map.Entry<String, String>> entries = map.entrySet();
        //通过遍历获取set集合中所有的键值对对象
        /*for (Map.Entry<String, String> entry : entries) {
            //entry此时表示所有的键值对对象

            //获取键
            String key = entry.getKey();
            //获取值
            String value = entry.getValue();

            //打印输出键和值
            System.out.println(key + "=" + value);
        }*/


        //第三种遍历方式：通过Lambda表达式遍历
        //底层原理：其实就是利用第二种遍历方式，依次得到每一个键和值，然后再调用accept方法
        /*map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                //打印输出键和值
                System.out.println(key + "=" + value);
            }
        });*/

        map.forEach((key, value) -> System.out.println(key + "=" + value));

    }
}
