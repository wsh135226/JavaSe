package list07;

import java.util.ArrayList;

//测试类
public class Test {

    public static void main(String[] args) {

       ArrayList<Dog> list1 = new ArrayList<>();
       ArrayList<Cat> list2 = new ArrayList<>();
       ArrayList<Animal> list3 = new ArrayList<>();

       list1.add(new HSQDog("奥斯卡",2));
       list1.add(new TDDog("豆豆",1));

       list2.add(new BSCat("波斯",1));
       list2.add(new LHCat("李华",2));

       //keepPet1(list2);

       //keepPet2(list1);

       keepPet3(list1);
       keepPet3(list2);
       keepPet3(list3);


    }

    //定义一个饲养动物的方法


    //要求3：饲养动物的方法不能是其他，比如Student
    //要求1：饲养猫的方法不能养狗
    public static void keepPet1(ArrayList<? extends Cat> list){
        //遍历集合
        for (Cat cat : list) {
            cat.eat(cat.getName(),cat.getAge());
        }
    }

    //要求2：饲养狗的方法不能养猫
    public static void keepPet2(ArrayList<? extends Dog> list){
        //遍历集合
        for (Dog dog : list) {
            dog.eat(dog.getName(),dog.getAge());
        }
    }

    public static void keepPet3(ArrayList<? extends Animal> list){
        //遍历集合
        for (Animal a : list) {
            a.eat(a.getName(),a.getAge());
        }
    }
}
