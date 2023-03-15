package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("--------------addAll----------------");
        //1.批量添加元素
        Collections.addAll(list, "abc", "123", "ddd", "ABC");
        System.out.println(list);

        System.out.println("-------------shuffle-----------------");
        //打乱集合中的元素
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("-------------sort:按照默认规则排序（默认升序）-----------------");
        //字符串按照Ascll码表排序
        //底层实现了Comparable接口
        Collections.sort(list);
        System.out.println(list);

        System.out.println("-------------sort:按照指定规则排序-----------------");
        //按照指定规则进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);//降序
            }
        });
        System.out.println(list);


        System.out.println("-------------max/min:根据默认的自然排序获取最大值或最小值-----------------");
        String max = Collections.max(list);
        String min = Collections.min(list);
        System.out.println("最大值" + max);
        System.out.println("最小值" + min);

        System.out.println("-------------swap:交换集合中指定位置的元素(按照索引交换)-----------------");
        Collections.swap(list,0,1);
        System.out.println(list);

        System.out.println("-------------以二分查找法查找元素-----------------");
        int result = Collections.binarySearch(list, "abc");
        System.out.println(result);
    }
}
