package list07;
//泰迪类
public class TDDog extends Dog{

    public TDDog() {
    }

    public TDDog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(String name, Integer age) {
        System.out.println("一只名叫" + name + "," + age + "岁的泰迪正在吃骨头，边吃边蹭");

    }
}
