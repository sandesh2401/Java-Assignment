//package Program;

import java.util.LinkedList;

public class Program9 {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(40);
    list.add(50);
    list.add(60);
    System.out.print(list);
    System.out.println();
    list.add(2,30);
    System.out.print(list);
    }
}
