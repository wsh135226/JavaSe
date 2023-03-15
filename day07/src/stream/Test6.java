package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 2, 2, 6, 8,7,3,11,14,7, 10,7, 12, 12};
        //1,1,2,2,2,3,5,6,7,12,12   list.size()=5  遍历的元素总和=9 下一次遍历索引应该为9
        ms(arr);
    }

    /*
     * 解题思路:
     * 遍历数组，得到每一个数据
     * 定义一个计数器，用于判断有几个元素相同
     * 从0索引开始判断每一个数据是否相同
     * 如果相同，计数器执行+1操作
     * 第一轮循环结束
     * 如果计数器大于1，那么证明有相同的元素
     * 就把被比较的即0索引上的元素也进行输出
     * 核心思路：
     * 把相同元素看成是一组一组的，
     * 每一次循环就是循环一组数据
     * 当遍历完一组后，下一次遍历的索引就是下一组重复元素开始的索引
     * 如：1, 1, 1, 3, 3, 3
     * 第一轮循环遍历的就是 '1' 这一组元素，
     * 当'1'这一组元素遍历完毕后，
     * 下一次遍历的索引就是从元素3开始
     * 避免了元素的重复遍历和存入
     *
     *
     *
     * */

    public static void ms(int[] arr) {
        //定义一个集合，用于存储相同数据
        ArrayList list = new ArrayList();
        //将数组进行排序
        Arrays.sort(arr);
        //定义一个计数器,用于记录有几个重复的元素
        int count = 0;
        //定义一个变量，用于记录索引
        int index = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                //index:用于记录被遍历的元素有几个
                //如1这个元素，总共有两个，那么下一次遍历的索引应该是从2索引开始
                //元素'1'共有两个，即内循环只遍历两次，次数刚好和下一次开始遍历的索引一致
                index += 1;
                if (arr[i] == arr[j]) {
                    //元素相同
                    count += 1;
                } else {
                    //如果遇到不同元素，直接停止循环，提高效率
                    break;
                }
            }
            //第一轮循环结束
            if (count > 0) {
                for (int k = 0; k < count + 1; k++) {
                    list.add(arr[i]);
                }
                //因为循环变量会自增，所以要-1
                i = index - 1;
            }

        }
        //遍历集合
        for (Object o : list) {
            System.out.print(o + " ");
        }

    }
}
