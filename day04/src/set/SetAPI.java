package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetAPI {

    public static void main(String[] args) {
        //创建对象
        Set<String> s = new HashSet<>();

        //添加数据
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        s.add("ddd");
        s.add("eee");


        //清空数据
        //s.clear();

        //删除数据
        /*s.remove("aaa");

        //判断是否包含当前对象（是否包含aaa）
        boolean result = s.contains("aaa");
        System.out.println(result);

        System.out.println(s)*/;

        //1.利用迭代器遍历数据
        //获取迭代器对象
        /*Iterator<String> i = s.iterator();
        while (i.hasNext()){
            String str = i.next();
            System.out.print(str+" ");
        }*/

        //2.增强for遍历
       /* for (String str : s) {
            System.out.print(str+" ");
        }*/

        //3.Lambda表达式遍历
        s.forEach(str -> System.out.print(str +" "));

    }
}
