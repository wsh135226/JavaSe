package sort;
//递归算法
public class RecursionDemo {

    public static void main(String[] args) {

        //需求：利用递归算法求1~100之间的和
        /*
        需求分析：（找规律）
        1.求1~100之间的和可以拆成100+(1~99)之间的和
        2.求1~99之间的和可以拆成99+(1~98)之间的和
        3.求1~98之间的和可以拆成99+(1~97)之间的和
        ......
        4.求1~2之间的和可以拆成2+(1~1)之间的和
        2.求1~1之间的和直接就是1---》出口
        */

        System.out.println(getSum(100));
    }

    //定义一个方法求和
    public static int getSum(int number){

        //判断出口
        if (number == 1){
            return 1;
        }

        int i = number + getSum(number - 1);

        //System.out.println(i);

        return i;
    }
}
