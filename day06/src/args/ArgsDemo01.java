package args;

//可变参数
public class ArgsDemo01 {

    public static void main(String[] args) {
        //练习：记录数据的和

        System.out.println(getSum5(1));

    }

    //定义方法

    //1.记录2个数据的和
    public static int getSum1(int a, int b) {
        return a + b;
    }

    //2.记录3个数据的和
    public static int getSum2(int a, int b, int c) {
        return a + b + c;
    }

    //3.记录4个数据的和
    public static int getSum3(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //4.记录n个数据的和
    public static int getSum4(int[] arr) {
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        return count;
    }

    //利用可变参数计算数据和

    //1.可变参数是jdk5出现的
    //2.格式：参数类型...参数名
    //3.作用：方法形参的个数是可以改变的
    //4.可变参数底层就是一个数组，底层会将所有数据放入一个数组中
    //5.在方法的形参中，可变参数只能有一个
    //6.在方法的形参中，如果除了可变参数外还有其它参数，那么可变参数要写在最后
    public static int getSum5(int...args){
        int count = 0;
        //遍历数组
        for (int i = 0; i < args.length; i++) {
            count = count + args[i];
        }
        return count;
    }
}
