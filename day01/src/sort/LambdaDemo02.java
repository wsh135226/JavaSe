package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo02 {

    public static void main(String[] args) {
        //需求：按照字符串长度排序数组

        //定义一个字符串数组
        String[] arr = {"a", "aa", "aaa", "aaaa"};

        /*Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });*/

        //lambda表达式完整写法
        /*Arrays.sort(arr, (String o1, String o2) -> {
                return o1.length() - o2.length();
            }
        );*/

        //lambda表达式省略写法
        Arrays.sort(arr, (o1, o2) ->
                o1.length() - o2.length()

        );

        System.out.println(Arrays.toString(arr));

    }
}
