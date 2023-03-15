package list04;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //System.out.println(list);

        String s = list.get(1);
        System.out.println(s);

        System.out.println(list.size());

    }
}
