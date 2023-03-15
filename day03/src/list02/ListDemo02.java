package list02;

import java.util.*;
import java.util.function.Consumer;

public class ListDemo02 {

    public static void main(String[] args) {

        //创建List集合对象并添加元素
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器遍历
        //创建迭代器对象
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }*/

        //2.增强for遍历
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //3.Lambda表达式遍历
        //list.forEach(s -> System.out.println(s));

        //4.普通for遍历
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        //5.列表迭代器遍历
        //创建列表迭代器对象
        //继承了Iterator,所以本质上也是一个迭代器，里面的指针默认也是指向0索引
        //和迭代器相比，额外添加了一个方法：add，可以在循环过程中添加数据
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()){
            String str = li.next();
            if (str.equals("ccc")){
                li.add("ddd");
            }
        }
        System.out.println(list);

    }
}
