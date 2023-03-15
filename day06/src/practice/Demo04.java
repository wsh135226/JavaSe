package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo04 {

    public static void main(String[] args) {
        //定义一个map集合
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list1,"南京市","扬州市","无锡市","南通市","徐州市");
        Collections.addAll(list2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(list3,"南宁市","柳州市","来宾市","河池市","桂林市");

        map.put("江苏省",list1);
        map.put("湖北省",list2);
        map.put("广西壮族自治区",list3);

        map.forEach((String key, ArrayList<String> value) -> System.out.println(key + "=" + value));
    }
}
