package practice;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("zhangsan", 20, 0, 0, 0);//总分：0
        Student s2 = new Student("lisi", 21, 1, 2, 3);//总分：6
        Student s3 = new Student("wangwu", 20, 2, 7, 1);//总分：15
        Student s4 = new Student("zhangsan", 20, 0, 0, 0);
        Student s5 = new Student("zhaoliu", 23, 2, 6, 2);//总分：10

        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //System.out.println(ts);

        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
