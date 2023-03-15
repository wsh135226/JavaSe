package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//随机点名器1
public class Demo01 {
    public static void main(String[] args) {
        //创建集合并且添加数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"慕容复","慕容博","乔峰","岳不群","段誉","萧远山","虚竹","小龙女");

        //创建随机对象
        Random r = new Random();
        int index = r.nextInt(list.size());

        //进行随机点名
        for (int i = 0; i < list.size(); i++) {
            if (index == i){
                System.out.println("被点名的是"+list.get(i));
                break;
            }
        }
    }
}
