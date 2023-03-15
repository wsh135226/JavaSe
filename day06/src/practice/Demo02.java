package practice;

import java.util.Random;

//随机点名器2
public class Demo02 {
    public static void main(String[] args) {
        //班级里有N个学生
        //需求：
        // 70%概率抽到男生
        // 30%概率抽到女生

        Random r = new Random();
        int index = r.nextInt(10) + 1;
        if (index <= 7) {
            System.out.println("抽到了男");
        } else {
            System.out.println("抽到了女");
        }
    }
}
