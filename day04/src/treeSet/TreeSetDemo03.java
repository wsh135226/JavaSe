package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo03 {

    public static void main(String[] args) {
        //第二种排序方式：比较器排序（Comparator）

        //创建对象
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                //o1:要添加的元素
                //o2:已经存在的元素
                //返回值：和第一种排序方式一样

                //按照长度排序
                int result = o1.length() - o2.length();

                //长度一样，按照首字母排序
                if (result == 0){
                    //String已经重写了compareTo方法，可以直接调用
                    result = o1.compareTo(o2);
                }

                return result;
            }
        });

        //添加数据
        ts.add("cb");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}
