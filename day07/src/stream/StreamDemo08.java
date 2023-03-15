package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo08 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,4,5,6,7,8,9,10);

        //需求：过滤奇数，保留偶数，并将结果保存起来
        List<Integer> list2 = list1.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        //打印结果
        System.out.println(list2);//[2, 4, 6, 8, 10]
    }
}
