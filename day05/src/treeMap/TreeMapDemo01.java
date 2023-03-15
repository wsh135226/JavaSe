package treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo01 {

    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });

        //默认是按照键的升序进行排列的
        // 因为Integer底层已经指定了排序规则
        // String也指定了排序规则，字母按照Ascll码表排列
        tm.put(1,"联想电脑");
        tm.put(2,"戴尔电脑");
        tm.put(3,"华为手机");
        tm.put(4,"苹果手机");

        System.out.println(tm);


    }
}
