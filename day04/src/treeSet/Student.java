package treeSet;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;

    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //this:表示当前要添加进集合的元素
        //o:表示集合中已经存在的元素
        /*
        返回值：
        1.负数：添加的元素存左边（红黑树的左边）
        2.正数：添加的元素存右边（红黑树的右边）
        3.0：  添加的元素舍弃（因为重复了不存）
         */

        System.out.println("this:"+this);
        System.out.println("o:"+o);

        //按照年龄排序
        //int result = o.getAge() - this.getAge();//年龄从大到小排序
        int result = this.getAge() - o.getAge();//年龄从小到大排序
        return result;
    }
}
