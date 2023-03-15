package linkedHashSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        //创建对象并添加数据
        LinkedHashSet<String> lhs = new LinkedHashSet();
        lhs.add("aaa");
        lhs.add("bbb");
        lhs.add("ccc");

        System.out.println(lhs);
    }
}
