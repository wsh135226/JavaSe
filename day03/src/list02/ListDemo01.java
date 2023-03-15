package list02;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

    public static void main(String[] args) {
        //创建List集合对象
        //细节：List集合是一个接口，所以不能直接创建对象，可以利用多态创建对象
        //因为List集合继承Collection接口，所以可以使用Collection接口的所有方法
        List<Integer> list = new ArrayList<>();

        //List集合独有的方法

        //添加
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(2,3);//在指定索引的位置上插入元素-->在2索引的位置上插入元素3

        System.out.println(list);

        //删除
        Integer r = list.remove(1);//删除1索引上的元素，并返回这个元素

        System.out.println("被删除的1索引上的元素："+r);
        System.out.println(list);//2

        //修改
        Integer set = list.set(0, 2);//修改0索引对应的元素，并返回这个元素
        System.out.println("被修改的元素："+set);//1

        //查询（获取）
        Integer get = list.get(0);//获取0索引上的元素
        System.out.println(get);//2


    }
}
