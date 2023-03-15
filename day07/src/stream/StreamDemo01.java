package stream;

import java.util.ArrayList;

public class StreamDemo01 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三丰");
        list1.add("张强");
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("灭绝师太");

        //利用Stream流
        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length() == 3).forEach(System.out::println);

        //把所有以张开头的元素存到集合中
        //ArrayList<String> list2 = new ArrayList<>();

        /*for (int i = 0; i < list1.size(); i++) {
            String name = list1.get(i);
            //判断
            //把开头为"张"且长度为3的元素存入集合中
            if (name.startsWith("张")&&name.length() == 3){
                list2.add(name);
            }
        }*/

        //System.out.println(list2);
    }
}
