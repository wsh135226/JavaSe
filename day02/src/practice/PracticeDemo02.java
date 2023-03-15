package practice;

//练习2
public class PracticeDemo02 {

    public static void main(String[] args) {
        //求解方式1：

        /*//1.创建一个长度为12的数组
        int[] arr = new int[12];
        //2.给0索引和1索引上的元素赋值
        //0索引和1索引的数据是固定的
        arr[0] = 1;
        arr[1] = 1;
        //3.利用循环给剩余索引赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println("12月有" + arr[arr.length - 1] + "对兔子");*/

        System.out.println(getSum(12));

    }

    //求解方式2
    public static int getSum(int month){

        //1月和2月兔子对数为1
        if (month == 1 || month == 2){
            return 1;
        }

        return getSum(month - 1) + getSum(month - 2);

    }
}
