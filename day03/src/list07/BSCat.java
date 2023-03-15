package list07;

//波斯猫类
public class BSCat extends Cat {

    public BSCat() {
    }

    public BSCat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(String name, Integer age) {
        System.out.println("一只名叫" + name + "," + age + "岁的波斯猫正在吃小饼干");
    }
}
