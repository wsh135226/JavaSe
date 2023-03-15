package function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo03 {

    public static void main(String[] args) {

        //1.定义集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        //3.转换数据
        /*list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                //toUpperCase():把小写转为大写
                String result = s.toUpperCase();
                return result;
            }
        }).forEach(System.out::println);*/

        //4.改为方法引用
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
