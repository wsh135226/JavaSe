package practice;
//练习3
public class PracticeDemo03 {

    public static void main(String[] args) {

        int sum = getSum(1);
        System.out.println(sum);

    }

    //1.找出口：day == 10
    //2.找规律：前一天桃子的数量等于后一天桃子的数量 + 1 * 2

    public static int getSum(int day){
        //指定天数
        if (day<=0 || day>=11){
            System.out.println("天数不符合");
            return -1;
        }

        //找出口
        if (day == 10){
            return 1;
        }

        //day + 1:后一天
        return (getSum(day + 1) + 1) * 2;
    }
}
