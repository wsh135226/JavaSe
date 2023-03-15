package list07;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(String name,Integer age) {
        System.out.println("猫会吃东西");
    }
}
