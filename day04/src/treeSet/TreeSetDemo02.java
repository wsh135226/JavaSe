package treeSet;

import java.util.TreeSet;

public class TreeSetDemo02 {

    public static void main(String[] args) {

        //需求：按照年龄进行排序，同年龄按照名字字母排序，同年龄和同名字认为是同一个人

        //创建对象
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",21);
        Student s3 = new Student("wangwu",22);
        Student s4 = new Student("zhangsan",20);

        /*
        * 默认的排序规则（自然排序）：
        * 需要排序的类实现Comparable接口，重写compareTo方法，
        * 在方法中编写排序规则
        * 2.TreeSet不需要重写hashCode方法和equlas方法，因为底层不是哈希表，而是红黑树
        *
        * */

        //添加数据
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
       /* for (Student t : ts) {
            System.out.println(ts);
        }*/

    }
}
