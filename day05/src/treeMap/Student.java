package treeMap;

public class Student implements Comparable<Student>{

    private String name;

    private Integer age;


    public Student() {
    }

    public Student(String name, Integer age) {
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
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }


    @Override
    public int compareTo(Student o) {
        //按照年龄排序
        int result = this.getAge() - o.getAge();//升序
        //如果年龄一样，那么按照名字顺序进行排序
        result = result==0?this.getName().compareTo(o.getName()):result;
        //返回排序结果
        return result;
    }
}
