package practice;

public class Student implements Comparable<Student> {

    private String name;

    private int age;

    private int verbal;

    private int mathematics;

    private int ETAPP;


    public Student() {
    }

    public Student(String name, int age, int verbal, int mathematics, int ETAPP) {
        this.name = name;
        this.age = age;
        this.verbal = verbal;
        this.mathematics = mathematics;
        this.ETAPP = ETAPP;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return verbal
     */
    public int getVerbal() {
        return verbal;
    }

    /**
     * 设置
     *
     * @param verbal
     */
    public void setVerbal(int verbal) {
        this.verbal = verbal;
    }

    /**
     * 获取
     *
     * @return mathematics
     */
    public int getMathematics() {
        return mathematics;
    }

    /**
     * 设置
     *
     * @param mathematics
     */
    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    /**
     * 获取
     *
     * @return ETAPP
     */
    public int getETAPP() {
        return ETAPP;
    }

    /**
     * 设置
     *
     * @param ETAPP
     */
    public void setETAPP(int ETAPP) {
        this.ETAPP = ETAPP;
    }


    public String toString() {
        int i = this.getVerbal() + this.getMathematics() + this.getETAPP();
        //System.out.println(this.getName()+"的总分：" + i);
        return "Student{name = " + name +
                ", age = " + age +
                ", verbal = " + verbal +
                ", mathematics = " + mathematics +
                ", ETAPP = " + ETAPP +
                ", 总分 = " + i +
                "}";

    }

    @Override
    public int compareTo(Student o) {

        //先按照总分进行排序
        int result = (this.getVerbal() + this.getMathematics() + this.getETAPP())
                - (o.getVerbal() + o.getMathematics() + o.getETAPP());

        //总分一样，按照语文成绩排
        result = result == 0 ? this.getVerbal() - o.getVerbal() : result;

        //语文成绩一样,按照数学成绩排
        result = result == 0 ? this.getMathematics() - o.getMathematics() : result;

        /*数学成绩一样,按照英语成绩排
        如果总分和语文成绩和数学成绩一样，那么英语成绩肯定一样，所以可以不用比较，提高程序效率
        result = result == 0 ? this.getETAPP() - o.getETAPP() : result;*/

        //成绩一样,按照年龄排
        result = result == 0 ? this.getAge() - o.getAge() : result;

        //年龄一样，按照名字字母顺序排
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;

        return result;
    }

}
