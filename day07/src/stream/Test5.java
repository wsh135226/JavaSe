package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test5 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 4, 5, 2, 2, 2, 6};
        ms(arr);
    }

    /*
    * 代码思路：
    * 以所有的元素为键，当键不重复时，值为空
    * 当值重复是，键和值是同样的元素
    * 最后做一个判断：
    * 如果键对应的值不为空，那么证明这个有重复的元素
    * 如果键对应的值为空，证明不是重复的元素
    *
    * */

    public static void ms(int[] arr){
        HashMap<Integer, ArrayList<Object>> hm = new HashMap<>();
        ArrayList list = new ArrayList();
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])){
                list.add(arr[i]);
                //不是第一次出现
                hm.put(arr[i],list);
            }else {
                //第一次出现
                hm.put(arr[i],null);
            }
        }

        //遍历hashmap
        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            //通过键获取值
            Object value = hm.get(key);
            if (value != null){
                //如果键对应的值不为空，证明有重复元素
                list.add(key);
            }
        }

        //遍历list集合
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
