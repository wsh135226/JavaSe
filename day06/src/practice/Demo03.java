package practice;

import java.util.*;

//随机点名器3
public class Demo03 {

    public static void main(String[] args) {
        //创建集合并且添加数据
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "慕容复", "慕容博", "乔峰", "岳不群", "段誉", "萧远山", "虚竹", "小龙女");
        //创建集合，用于存储已经点过名的学生
        ArrayList<String> list2 = new ArrayList<>();

        //定义Scanner，指定是否随机点名
        Scanner sc = new Scanner(System.in);

        //定义变量，记录是第几次点名
        int count = 0;
        while (true) {
            System.out.println("是否随机进行点名(y/n)");
            String str = sc.next();
            if (str.equals("y")) {
               /* count++;
                System.out.println("第"+count+"次随机点名");*/
                randomIndex(list1, list2);
            } else if (str.equals("n")) {
                break;
            } else {
                System.out.println("没有这个选项");
            }
        }

        //System.out.println();
    }

    public static void randomIndex(ArrayList<String> list1, ArrayList<String> list2) {
        //创建随机对象
        Random r = new Random();
        //定义一个变量，用于记录list1的长度
        int count = list1.size();
        //随机点名
        for (int i = 0; i < count; i++) {
            int index = r.nextInt(list1.size());
            System.out.println("被点到名的学生为:" + list1.get(index));
            //点到名字的学生从第一个集合中删掉
            String name = list1.remove(index);
            //再添加到list2中
            list2.add(name);
        }

        if (list2.size() == count){
            list1.addAll(list2);
            list2.clear();
        }
    }


}
