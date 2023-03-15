package sort;

import javax.naming.PartialResultException;

public class Test {

    public static void main(String[] args) {

        //

        int nums[] = {1,3,5,6,8,9,12};
        int target = 10;
        System.out.println(getIndex(nums, target));

    }

    //需求分析：
    /*
    * target存在：返回所在索引
    * target不存在：
    *   1.target<0索引时，即target最小，直接返回0
    *   2.target>最大索引时，即target最大，返回最大索引 + 1
    *   3.0<target<最大索引时，遍历数据。
    *
    *
    * */

    public static int getIndex(int nums[] , int target){

        //定义最小索引
        int min = 0;
        //定义最大索引
        int max = nums.length - 1;

        while (true){

            //找到对应元素时，返回下标
            for (int i = 0; i < nums.length; i++) {

                if (target == nums[i]){
                    return i;
                }
            }

            //没有对应元素时
            //1.target<0索引时，即target最小，直接返回0
            if (target < nums[min]){
                return min;
            }

            //2.target>最大索引时，即target最大，返回最大索引 + 1
            if (target > nums[max]){
                return max + 1;
            }

            //3.0<target<最大索引时
            //定义中间元素
            int mid = (min + max) / 2;

            //1.如果指定元素的值大于中间元素
            if (target > nums[mid]){
                //在右边
                min = mid + 1;

            }else if (target < nums[mid]){
                //在左边
                max = mid - 1;

            }else{

                return mid + 1;

            }


        }

    }
}
