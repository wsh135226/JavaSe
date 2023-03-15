package sort;

//选择排序
public class SelectionSortDemo {

    public static void main(String[] args) {

        //定义一个数组
        int arr[] = {3, 5, 2, 6, 1, 4};
        //需求：利用选择排序将这些元素进行排序

        PrintArr(arr);

        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);
        System.out.println("hello world");

    }

    //选择排序：从0索引开始依次和后面的元素进行比较，小的放前面，大的放后面
    //第一次循环结束，得到最小值，放在最左边

    public static void PrintArr(int[] arr) {

        //外循环：循环执行的轮数(n-1轮)
        for (int i = 0; i < arr.length; i++) {
            //内循环：比较并排列数据
            for (int j = i+1; j < arr.length; j++) {
                //判断
                if (arr[i] > arr[j]) {
                    //定义一个第三方变量
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
