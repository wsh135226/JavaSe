package list07;

//哈士奇类
public class HSQDog extends Dog {

    public HSQDog() {
    }

    public HSQDog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(String name, Integer age) {
        System.out.println("一只名叫" + name + "," + age + "岁的哈士奇正在吃骨头，边吃边拆家");

    }
}
