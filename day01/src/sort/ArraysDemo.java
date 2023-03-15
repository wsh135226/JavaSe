package sort;

import java.util.Arrays;
import java.util.Comparator;

//一个操作数组的工具类
public class ArraysDemo {

    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //调用方法
        System.out.println("---------toString-----------");
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("---------binarySearch-----------");
        /*
        binarySearch前提：1.数组元素有序 2.是升序
        如果数据存在，则返回对应下标
        如果数据不存在，则返回负的插入点减一
        插入点：比如11存在，则在数组位置是10索引的位置，但此时11不存在，则 -10-1=-11
        为什么要减一？
        因为当这个不存在的元素如果存在且对应的索引时0索引的话，-0还是等于0，会造成混乱，所以要减一
         */
        System.out.println(Arrays.binarySearch(arr,10));//9
        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr,11));//-11

        System.out.println("---------copyOf-----------");
        //第一个参数：旧数组
        //第二个参数：新数组的长度
        //细节：当新数组长度大于老数组时，会补上默认初始值
        int[] newArr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr1));

        System.out.println("---------copyOfRange-----------");
        //第一个参数：旧数组
        //第二个参数：要从旧数组哪个索引开始拷贝
        //第三个参数：拷贝到旧数组的哪个索引结束
        //细节：包头不包尾
        int[] newArr2 = Arrays.copyOfRange(arr, 0, 3);
        System.out.println(Arrays.toString(newArr2));

        //fill：填充数组，将数组中的所以元素全部变成某个数据
        System.out.println("---------fill-----------");
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));

        //sort:给数组排序，默认时升序排序，底层使用的是快速排序
        System.out.println("---------sort-----------");
        int[] arr2 = {10,2,3,5,4,6,7,8,9,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //降序排列
        System.out.println("--------sort降序------------");
        Integer[] arr3 = {10,2,3,5,4,6,7,8,9,1};
        //第一个参数：需要排序的数组
        //第二个参数：Comparator接口的实现类
        //注意：要实现降序排列，只能是引用类型的数组
        Arrays.sort(arr3,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1 - o2:升序
                //o2 - o1:降序
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
