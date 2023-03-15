package hashMap;

import java.util.*;

public class HashMapDemo02 {

    public static void main(String[] args) {
        //定义一个集合，用于存储景点名称
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        //创建集合，用于存储学生投票的次数
        ArrayList<String> list2 = new ArrayList<>();

        //1.让学生投票,并把投票的数据存储起来
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(list1.size());//index随机等于A,B,C,D的索引
            list2.add(list1.get(index));//将随机投的票放到集合中
        }

        //2.统计学生投票的次数

        //定义集合，用于存储学生投票次数和景区名字
        HashMap<String, Integer> hm = new HashMap<>();

        //1.判断景区是否是第一次出现
        //如果是第一次投票，则记录为1
        //如果不是第一次投票，则加一之后再重新放到集合中
        for (String name : list2) {
            if (hm.containsKey(name)) {
                //不是第一次出现
                //1.获取这一次之前出现的次数
                Integer count = hm.get(name);
                //投票次数加一
                count++;
                //再将加一后的投票次数放入集合中
                hm.put(name, count);
            } else {
                //第一次出现
                hm.put(name, 1);
            }
        }

        System.out.println(hm);

        //定义一个变量，用于记录最大数
        int max = 0;

        //获取键对应的值（即景点被投票的次数）
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value >= max) {
                max = value;
            }
        }

        System.out.println(max);

        //得到投票次数最多的景区
        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value == max) {
                System.out.println(entry.getKey() + "景区投票的人数最多，有" + value + "票");
            }
        }


    }
}
