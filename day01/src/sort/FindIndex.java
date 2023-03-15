package sort;

public class FindIndex {

    public static void main(String[] args) {

        //定义一个整数数组
        int arr[] = {1,2,3,4,5};
        //定义一个目标值
        int target = 3;

        //调用方法
        System.out.println(getIndex(arr, target));
    }

    public static int getIndex(int arr[] , int target) {

        //遍历数组
        for (int i = 0; i < arr.length; i++) {

            //判断
            if (arr[i] == target){
                //找到，返回下标
                return i;
            }
        }

        //遍历结束后没找到，返回-1
        return -1;
    }
}
