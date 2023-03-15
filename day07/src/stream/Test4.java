package stream;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 4};
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            Integer next = i.next();//next表示集合里的每一个元素
            if (next == 1){
                i.remove();
            }

        }

        System.out.println(list);
    }
}
