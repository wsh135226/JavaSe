package map;

import java.util.HashMap;
import java.util.Map;

public class MapAPI {

    public static void main(String[] args) {
        //创建Map集合对象
        Map<String , Integer> map = new HashMap<>();

        //添加方法
        //Integer value1 = map.put("zhangsan", 20);
        //System.out.println(value1);//null-->因为没有覆盖任何的数据

        //map.put("lisi",21);
        //map.put("wangwu",22);

        //put方法的细节：
        /*
        put方法有两个功能：
        1.添加：如果键不存在，那么可以直接把键值对添加到map集合中，方法返回null
        2.覆盖：如果键存在，那么原来的键值对就会被新的键值对覆盖，并且返回原来键值对的值
         */
        //Integer value2 = map.put("zhangsan", 34);
        //System.out.println(value2);//20

        //System.out.println(map);//{lisi=21, zhangsan=34, wangwu=22}-->原来zhangsan=20被覆盖了

        map.put("zhangsan", 20);
        map.put("lisi",21);
        map.put("wangwu",22);

        //删除方法：根据键删除数据，并且返回被删除的值
        //Integer result = map.remove("zhangsan");
        //System.out.println(result);//20


        //清空集合中所有的元素
        //map.clear();

        //判断集合中是否包含对应的键
        boolean flag1 = map.containsKey("zhangsan");
        System.out.println(flag1);

        //判断集合中是否包含对应的值
        boolean flag2 = map.containsValue(20);
        System.out.println(flag2);

        //判断集合是否为空
        System.out.println(map.isEmpty());

        //获取map集合的长度，即获取map中键值对的个数
        System.out.println(map.size());

        System.out.println(map);//{lisi=21, wangwu=22}


    }
}
