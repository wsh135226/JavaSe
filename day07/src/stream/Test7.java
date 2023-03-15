package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test7 {

    static int target;

    public static void main(String[] args) {
        //int[] arr = {1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 4, 5, 2, 2, 2, 6};
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 6};
        ms(arr);
    }

    public static void ms(int[] arr) {
        //定义一个集合，用于存储重复数据
        ArrayList list = new ArrayList();
        //将数组进行排序
        Arrays.sort(arr);
        //定义一个变量，用于判断是否存在相同元素
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (target != arr[i]) {
                target = arr[i];
            } else {
                list.add(arr[i]);
                count += 1;
            }
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
