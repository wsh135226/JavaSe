package function;

import java.util.Arrays;

public class FunctionDemo02 {
    public static void main(String[] args) {
        //1.给定一组字符串，把类型转为整数类型
        String[] arr = {"1","2","3","4","5","6"};

        //定义一个变量，用于验证结果
        int sum = 0;

        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            //arr[i]:表示数组中的每一个数据
            int result = Integer.parseInt(arr[i]);
            //System.out.print(result + " ");
            sum += result;
        }

        //3.验证结果
        //System.out.println(sum);


        //使用方法引用
        Arrays.stream(arr).map(Integer::parseInt).forEach(System.out::println);

    }
}
