package list07;
//狸花猫类
public class LHCat extends Cat{

    public LHCat() {
    }

    public LHCat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(String name, Integer age) {
        System.out.println("一只名叫" + name + "," + age + "岁的狸花猫正在吃鱼");
    }
}
