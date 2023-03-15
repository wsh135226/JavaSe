package function;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo01 {

    public static void main(String[] args) {
        //定义一个数组，用倒序进行排序
        Integer[] arr = {1,2,5,4,3,6};

        //1.利用匿名内部类

        //只有引用数据类型的数组才能使用带两个参数的sort()方法进行自定义排序
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/



        //2.利用Lambda表达式
        //Arrays.sort(arr, (o1,o2)-> o2 - o1);



        //3.利用方法引用
        //方法引用的条件：
        /*
        * 1.引用处需要是函数式接口
        * 2.被引用的方法必须存在
        * 3.被引用的方法的返回值和参数必须和抽象方法的返回一致（如上面的compare()方法）
        * 4.被引用的方法必须满足当前功能的需求
        * */

        //使用方法引用
        //Arrays.sort(arr, (o1,o2)-> FunctionDemo01.sub(o1,o2));

        //FunctionDemo01::sub:表示引用FunctionDemo01中的sub方法
        //表示把sub这个方法当做抽象方法的方法体，即compare()方法的方法体
        Arrays.sort(arr,FunctionDemo01::sub);
        System.out.println(Arrays.toString(arr));


    }

    //定义一个方法，用于方法引用
    public static int sub(int o1,int o2){
        return o2 - o1;
    }

}
