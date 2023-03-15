package stream;

import java.util.*;

public class Test<E> {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 1, 1, 2, 3, 3, 3, 3, 2, 2, 2, 2, 7, 5, 6, 6, 6, 4, 4, 10};
        String[] arr2 = {"a", "a", "c", "c", "d", "e", "e", "b", "c", "b",};
        String[] arr3 = {"张", "张", "三", "三", "四", "李", "五", "李", "王", "王",};
        //先将数组进行排序，效果比较美观
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        ArrayList list1 = test(arr1);
        ArrayList list2 = test(arr2);
        ArrayList list3 = test(arr3);
        //打印结果
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }

    //定义一个方法，用于数组去重
    public static <E> ArrayList<E> test(E[] arr) {//E表示不知道数组类型，使用泛型
        //定义一个Set集合，用于一些去重效果
        HashSet<E> hs = new HashSet<>();
        //先将数组进行排序
        ArrayList<E> list = new ArrayList<>();
        //遍历数组
        for (E e : arr) {
            //判断元素是否是第一次出现
            if (hs.contains(e)) {
                //不是第一次出现
                list.add(e);
            } else {
                //第一次出现
                hs.add(e);
            }
        }
        //遍历set集合
        ListIterator<E> lit = list.listIterator();
        while (lit.hasNext()) {
            //得到List集合中的所有数据
            E keyList = lit.next();
            Iterator<E> i = hs.iterator();
            while (i.hasNext()) {
                E set = i.next();
                //判断
                if (set == keyList) {
                    lit.add(set);
                    //把这个元素移除掉，否则会重复存入
                    i.remove();
                }
            }
        }
        return list;
    }
}


