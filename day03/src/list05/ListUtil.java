package list05;

import java.util.ArrayList;

public class ListUtil {

    //私有化构造方法，不让创建这个对象,只能通过类名.方法名调用
    private ListUtil(){}

    public static <E> boolean addAll(ArrayList<E> list,E...e){

        for (E e1 : e) {
            list.add(e1);
        }

        return true;
    }
}
