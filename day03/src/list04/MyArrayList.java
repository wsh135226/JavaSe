package list04;

import javafx.beans.binding.StringBinding;

import java.util.Arrays;
import java.util.StringJoiner;

//E：表示不确定的类型
public class MyArrayList<E> {

    //定义一个变量，用于记录数组长度.私有，不对外提供
    private int size;

    //定义一个数组
    Object[] obj = new Object[10];

    //定义一个添加的方法
    //E:表示不确定添加的数据是什么类型
    //e:形参名
    public boolean add(E e) {
        //从0索引开始添加
        obj[size] = e;
        size++;
        return true;
    }

    //定义一个获取的方法
    public E get(int index) {
        //进行强转，因为返回的是不确定的类型
        return (E) obj[index];
    }

    //定义方法，得到集合长度
    public int size() {
        return size;
    }

    public String toString() {
        if (obj.length == 0) {
            return "[]";
        }
        return Arrays.toString(obj);
    }
}
