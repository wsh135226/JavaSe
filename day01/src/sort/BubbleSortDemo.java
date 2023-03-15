package sort;

//冒泡排序
public class BubbleSortDemo {

    public static void main(String[] args) {
        //定义一个数组
        int arr[] = {3, 5, 2, 6, 1, 4};
        //需求：利用冒泡排序将这些元素进行排序

        PrintArr(arr);

    }

    //冒泡排序：相邻元素两两比较,大的放后面，小的放前面
    //第一次循环：得到最大值放在右边

    public static void PrintArr(int[] arr) {

        //外循环:循环所要执行的轮数（n-1轮）
        for (int i = 0; i < arr.length -1; i++) {

            //内循环
            //-1:防止数组越界
            //-i:提高效率，每一轮循环结束后都会得到一个大值，下一次循环就不用比较这个大值
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //比较元素
                if (arr[j] > arr[j + 1]) {
                    //定义一个第三方变量
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }



        //遍历循环
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
