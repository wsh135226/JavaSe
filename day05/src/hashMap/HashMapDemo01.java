package hashMap;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapDemo01 {

    public static void main(String[] args) {

        HashMap<Student,String> hm = new HashMap<>();

        //添加数据
        hm.put(new Student("zhangsan",20),"珠海市");
        hm.put(new Student("lisi",21),"武汉市");
        hm.put(new Student("zhangsan",20),"北京市");
        hm.put(new Student("wangwu",22),"来宾市");

        //遍历集合
        hm.forEach((Student key, String value) ->{
            System.out.println(key + "=" + value);

        });
    }
}
