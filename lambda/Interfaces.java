package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Interfaces {
    Interfaces() {
        List<String> list1 = new ArrayList<String>();

        list1.add("abb");
        list1.add("aab");
        list1.add("bob");
        list1.add("ana");

        list1=search(list1);

        for(String i:list1) {
            System.out.println(i);
        }
    }
    static List<String> search(List<String> l1) {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
}
}
