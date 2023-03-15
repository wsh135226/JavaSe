package practice;

import java.util.Arrays;
import java.util.Comparator;

//练习1
public class PracticeDemo01 {

    public static void main(String[] args) {

        //创建女朋友对象
        GirlFriend g1 = new GirlFriend("tingting", 20, 160);
        GirlFriend g2 = new GirlFriend("lulu", 21, 165);
        GirlFriend g3 = new GirlFriend("nana", 22, 167);
        GirlFriend g4 = new GirlFriend("honghong", 20, 160);

        //定义数组，存储女朋友对象
        GirlFriend[] arr = {g1, g2, g3, g4};

       /* String a = "tingting";
        String b = "abc";
        System.out.println(a.compareTo(b));*/

        Arrays.sort(arr, ( o1,  o2) -> {
                //比较年龄
                int temp = o1.getAge() - o2.getAge();
                //年龄相同比较身高
                temp = temp == 0 ? temp = o1.getHeight() - o2.getHeight() : temp;
                //年龄身高相同，比较名字字母顺序
                temp = temp == 0 ? temp = o1.getName().compareTo(o2.getName()) : temp;

                return temp;

        });

        System.out.println(Arrays.toString(arr));

    }
}

class GirlFriend {

    private String name;
    private int age;
    private int height;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
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
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
