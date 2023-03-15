package practice;

import java.util.Collection;

//练习4
public class PracticeDemo04 {

    public static void main(String[] args) {

        //小明喜欢爬楼梯，一次可以爬一个或者两个台阶，如果有20个台阶有几种爬法？

        //一个台阶：一种爬法
        //两个台阶：两种爬法
        //三个台阶：二十一中爬法
        //...
        //二十个台阶：18个台阶和19个台阶爬法的总和
        System.out.println(getSum(20));

    }

    public static int getSum(int number){

        //1个台阶爬法
        if (number == 1){
            return 1;
        }

        //2个台阶爬法
        if (number == 2){
            return 2;
        }

        return getSum(number - 2) + getSum(number - 1);

    }


}
