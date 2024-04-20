//package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program6 {
    public static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        return list;
    }
    public static void main(String[] args) {
    List<Integer> list = Program6.getList();
    System.out.print(list);
    System.out.println();
    Collections.swap(list, 2, 3);
    System.out.print(list);
    }
}
