package sort;

//插入排序
public class InsertionSortingDemo {

    public static void main(String[] args) {

        //思想：将0索引到N索引的元素看成是有序的，将N+1索引到最大索引的元素看成是无序的
        //遍历无序的哪一组数据，将遍历出来的数据插入到有序那一列数据中合适的位置，如果遇到相同的数据，插在后面
        //N的范围：0~最大索引

        //定义一个数组，利用插入排序进行排序
        int arr[] = {3,5,2,6,1,7,4};

        priArr(arr);

    }

    public static void priArr(int[] arr) {

        //定义一个索引，记录无序元素开始索引
        int indexStart = -1;

        //得到有序数组
        for (int i = 0; i < arr.length - 1; i++) {
            //判断
            if (arr[i] > arr[i + 1]) {
                indexStart = i + 1;
                break;
            }
        }

        //找到无序数据
        for (int i = indexStart; i < arr.length; i++) {

            //定义一个变量，记录要插入的无序数据的索引
            int j = i;

            //j>0:插入的无序数据的索引不能小于0，当等于0时就是最小数据，不用再比较
            //arr[j] > arr[j - 1]:如果后一个元素大于前一个元素，则换位
            while (j > 0 && arr[j] < arr[j - 1]) {
                //交换位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }


}


