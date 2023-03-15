package list03;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        //创建对象并添加数据
        LinkedList<String> ll = new LinkedList();
        ll.add("aaa");
        ll.add("bbb");
        ll.add("ccc");

        //1.将元素添加到0索引的位置
        ll.addFirst("qqq");


        //2.将元素添加到末尾索引的位置(相当于add方法)
        ll.addLast("ddd");

        System.out.println(ll);

        //3.获取头索引位置的元素
        String first = ll.getFirst();
        System.out.println(first);

        //4获取最后索引位置上的元素
        String last = ll.getLast();
        System.out.println(last);

        //5.删除头索引位置上的元素,并返回这个元素
        String s = ll.removeFirst();
        System.out.println(s);
        System.out.println(ll);

        //6.删除尾索引位置上的元素,并返回这个元素
        String s1 = ll.removeLast();
        System.out.println(s1);
        System.out.println(ll);

    }
}
