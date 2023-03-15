package stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo09 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

        //需求：保留年龄大于24岁的人，并将集合放入一个map集合中，姓名为键，年龄为值

        //s表示流中的每一个数据
        Map<String, String> map = list.stream().
                filter(s -> Integer.parseInt(s.split(",")[1]) > 24).//过滤大于24岁的人
                collect(Collectors.toMap(//将过滤后的数据放入集合中
                        s -> s.split(",")[0]
                        , s -> s.split(",")[1])
                );


        //打印数据
        System.out.println(map);
    }
}
