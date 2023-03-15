package sort;

//快速排序
public class QuickSortDemo {

    public static void main(String[] args) {

        //快速排序：
        // 第一轮：
        // 把0索引上的数看成是基准数，确定基准数在数组中的位置
        // 把基准数大的数放在右边，比基准数小的数放在左边

        //定义一个数组
        int arr[] = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        //调用方法
        quickSort(arr, 0, arr.length - 1);

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //定义方法编写快速排序
    /*
    参数：
    1.要进行快速排序的数组
    2.快速排序的数组的开始索引
    3.快速排序的结束索引
     */
    public static void quickSort(int[] arr, int i, int j) {

        //定义两个变量
        int start = i;
        int end = j;

        //递归出口
        //如果end比start小,结束递归
        if (end < start) {
            return;
        }

        //定义一个变量记录基准数
        int baseNumber = arr[i];

        //利用循环进行换位
        //放start和end重合的时候，循环结束
        while (start != end) {

            //注意：第一个循环一定是先判断end，即end先移动，否则排序不了

            //第一个循环：end从后面开始找，如果找到比基准数小的数，循环停止
            //判断条件：
            // 1.arr[end] < baseNumber :比基准数小
            // 2.end <= start:当end小于或等于start时，循环停止
            while (true) {
                if (arr[end] < baseNumber || end <= start) {
                    break;
                }
                //第一轮没找到，在往前找
                end--;

            }

            //第二个循环：start从前面开始找，如果找到比基准数大的数，循环停止
            //判断条件：
            // 1.arr[start] > baseNumber :比基准数大，循环停止
            // 2.end <= start:当end小于或等于start时，循环停止
            while (true) {
                if (arr[start] > baseNumber || end <= start) {
                    break;
                }

                //第一轮没找到，从后面找
                start++;

            }

            //把end和start的数进行交换
            int number = arr[end];
            arr[end] = arr[start];
            arr[start] = number;

        }

        //循环结束，start=end，指向的元素和基准数换位（基准数归位）
        int temp = arr[i];//arr[i]:arr[0]--->即第一个数字
        arr[i] = arr[start];
        arr[start] = temp;

        //将基准数的左边看成是一个新的范围,利用递归算法
        //开始：i=0 结束：j = start -1--->在第一轮结束后start和end重合了
        quickSort(arr, i, start - 1);
        //将基准数右边的数据看成一个范围
        //开始：i = start + 1 结束：j = 最大索引
        quickSort(arr, start + 1, j);


    }
}
