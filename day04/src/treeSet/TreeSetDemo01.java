package treeSet;

import java.util.TreeSet;

public class TreeSetDemo01 {

    public static void main(String[] args) {
        //创建对象
        TreeSet<Integer> ts = new TreeSet<>();
        //添加数据
        ts.add(1);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(2);
        System.out.println(ts);
    }
}
