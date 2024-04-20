//package Program;

import java.util.LinkedList;

public class Program14 {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    System.out.print(list);
    list.set(2, 25);
    System.out.println("\nReplace element at index "+list.indexOf(25)+" : "+list.get(2));
    }
}
