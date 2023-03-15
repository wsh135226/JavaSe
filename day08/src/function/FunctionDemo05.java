package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class FunctionDemo05 {

    public static void main(String[] args) {

        //定义集合并添加数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,24","王五,253");

        //收集数据到Student类型的数组中
        //1.先把String类型的数据变成Student类型的数据
        Student[] students = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] split = s.split(",");
                return new Student(split[0], Integer.parseInt(split[1]));
            }
        }).toArray(new IntFunction<Student[]>() {
            @Override
            public Student[] apply(int value) {
                return new Student[value];
            }
        });

        System.out.println(Arrays.toString(students));

    }
}
