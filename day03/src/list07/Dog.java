package list07;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(String name,Integer age) {
        System.out.println("狗会吃东西");
    }
}
