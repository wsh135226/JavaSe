package list01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {

    public final int ANC = 1;

    public static void main(String[] args) {
        //创建对象
        Collection c = new ArrayList();//接口不能直接创建对象，但可以通过实现类--》多态
        /*
        细节1：如果是往List集合添加数据，add的返回值永远为true，因为List集合可以添加重复的数据
        细节2：如果是往Set集合添加数据，如果这个数据不存在，那么返回值为true，如果存在返回false，表示添加失败
         */

        //添加数据
        c.add(1);
        c.add(2);
        c.add(3);

        System.out.println(c);

        //删除数据
        //细节：因为Collection中只有共性（所有子类都可以用）的方法，所以remove只能通过元素的对象删除，不能通过索引删除数据
        //如果数据存在，删除成功，否则删除失败，返回false
        boolean remove = c.remove(1);

        System.out.println(c);//删掉了1这个数据，而不是1索引对应的数据
        System.out.println(remove);//true


        //清空数据
        //c.clear();

        //System.out.println(c);

        //判断当前集合中是否包含给定对象(此数据)
        /*
        通过底层源码发现，contains方法底层是依赖于equals方法的
        如果集合中存储的是自定义对象，当我们想使用contains方法进行比较时，必须要在自定义javabean中重写equals方法
        原因：如果不重写equals方法，那么默认使用的就是Object类的equals方法，比较的是地址值
         */
        boolean flag = c.contains(1);
        System.out.println(flag);//false-->因为在上面已经被删除了

        //判断当前集合是否为空
        boolean empty = c.isEmpty();
        System.out.println(empty);//false

        //获取当前集合长度
        System.out.println(c.size());//2


    }
}
