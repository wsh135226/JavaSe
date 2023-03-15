package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 4, 5, 2, 2, 2, 6};
        //调用方法
        ArrayList<Integer> ms = ms(arr);
        //打印集合
        System.out.println(ms);
    }

    /*
     * 思路分析：
     * 从0索引的元素开始和后面的元素进行比较，
     * 如果相同的话，就存入集合里面，并且从集合里删掉这个元素
     * 因为如果不删掉的话，会造成数据的重复存入
     * 但是呢，删掉的话后面的元素会填补上来，就会造成数据不完整的情况
     * 我的解决办法就是，
     * 只有当遇到不相同的元素时，内循环的循环变量才会自增,并且停止内循环
     * */

    public static ArrayList<Integer> ms(int[] arr) {
        //定义一个计数器,用于判断被比较的元素是否有和它一样元素
        int count = 0;
        //将数组进行排序
        Arrays.sort(arr);
        //第一个集合的作用：存储原本的数据
        ArrayList<Integer> list1 = new ArrayList<>();
        //第二个集合的作用：存储筛选出的重复元素
        ArrayList<Integer> list2 = new ArrayList<>();
        //将数组的元素放入集合中，用集合来操作数据
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }

        //用于记录集合原本的长度
        int size = list1.size();

        //循环的作用，遍历需要比较的数据
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < list1.size(); ) {
                //当遇到不相同元素时，停止内循环
                if (list1.get(i) != list1.get(j)) {
                    //循环变量自增
                    j++;
                    break;
                }
                //元素相同
                if (list1.get(i) == list1.get(j)) {
                    //存入集合
                    list2.add(list1.get(j));
                    //删除掉这个元素
                    list1.remove(j);
                    count += 1;
                }
            }
            //判断被比较的元素是否存在重复元素
            if (count > 0) {
                list2.add(list1.get(i));
                count = 0;
            }
        }
        //返回存储重复元素的集合
        return list2;
    }
}
