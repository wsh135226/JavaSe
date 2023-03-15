package list06;

import java.util.ArrayList;

public class Genericity {

    public static void main(String[] args) {

        ArrayList<Person> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();
        ArrayList<Animal> list3 = new ArrayList<>();
        method(list1);
        method(list2);
        //Animal没有继承Person类
        //method(list3);

        method2(list1);
        method2(list2);
        //Student不是Animal的子类
        //method2(list3);


    }

    //定义一个方法，方法形参只能是Person类或者它的子类
    //利用泛型的通配符
    public static void method(ArrayList<? extends Person> list){

    }
    //定义一个方法，方法形参只能是Student类或者它的父类
    public static void method2(ArrayList<? super Student> list){

    }
}
