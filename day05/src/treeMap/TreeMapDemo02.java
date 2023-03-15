package treeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo02 {

    public static void main(String[] args) {

        TreeMap<Student, String> tm = new TreeMap();

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangsan", 20);
        Student s5 = new Student("abc", 20);

        tm.put(s1, "江苏省");
        tm.put(s2, "浙江省");
        tm.put(s3, "广西壮族自治区");
        tm.put(s4, "广东省");
        tm.put(s5, "海南省");

        Set<Map.Entry<Student, String>> entries = tm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);

        }
    }
}
