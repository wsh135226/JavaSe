package treeMap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo03 {

    public static void main(String[] args) {
        //1.定义字符串
        String str = "aadbabcaacbbcde";

        //创建集合对象
        //如果统计的数据不需要进行排序，就使用HashMap集合进行统计
        //如果统计的数据需要进行排序，就使用TreeMap集合进行统计

        TreeMap<Character,Integer> tm = new TreeMap<>();

        //2.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //得到每一个字符
            char c = str.charAt(i);
            //判断得到的字符是否是第一次出现
            if (tm.containsKey(c)){
                //不是第一次出现
                //1.先获取已经出现的次数,即value
                Integer count = tm.get(c);
                //2.次数加一
                count++;
                //3.再将全部出现的次数存入集合
                tm.put(c,count);
            }else {
                //第一次出现
                tm.put(c,1);
            }
        }

        //System.out.println(tm);

        StringBuilder sb = new StringBuilder();

        //遍历集合，按照指定规则输出
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));

        //输出拼接后的结果
        System.out.println(sb);
        
    }
}
