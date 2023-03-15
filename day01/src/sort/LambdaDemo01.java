package sort;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo01 {

    public static void main(String[] args) {

        Integer[] arr = {10,2,3,5,4,6,7,8,9,1};

        //原生写法
       /* Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        //lambda表达式完整写法
        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                return o1 - o2;
            }
        );//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //lambda表达式省略写法
        /*
        * 1.如果方法体只有一行，那么大括号，return,分号都可以省略，但如果要省略，都要全部省略
        * 2.如果参数只有一个，参数类型可以省略，小括号也可以省略
        * 3.参数类型可以省略
        * */
        Arrays.sort(arr, (o1, o2)->
                     o1 - o2
        );//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println(Arrays.toString(arr));
    }
}
