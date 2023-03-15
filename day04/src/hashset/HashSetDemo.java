package hashset;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        //创建学生对象
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",21);
        Student s3 = new Student("zhangsan",20);
        Student s4 = new Student("wangwu",22);

        //创建集合存储学生对象
        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
