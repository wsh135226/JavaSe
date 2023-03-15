package list01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo02 {

    public static void main(String[] args) {

        //定义集合
        Collection list = new ArrayList();

        //添加数据
        list.add(1);
        list.add(2);
        list.add("a");
        list.add("3");
        list.add("b");
        list.add("c");

        //利用迭代器遍历集合
        //1.创建迭代器对象（获取指针）
        /*Iterator i = list.iterator();
        //2.判断当前指针指向的位置是否有元素，有返回true，没有返回false
        while (i.hasNext()) {
            //3.获取当前位置上的元素，并将指针往下一个位置移动
            //Object o = i.next();
            //打印获取的元素在到控制台
            System.out.print(i.next() + " ");
        }*/

        //利用增强for遍历集合
        //o:就是一个第三方变量，在循环过程中依次表示集合中的每个数据
        /*for (Object o : list) {
            System.out.print(o+" ");
        }*/


        //利用Lambda表达式进行遍历
        //底层也会进行遍历，得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //o:依次表示集合中的每个数据
        list.forEach( o -> System.out.println(o));

    }
}
