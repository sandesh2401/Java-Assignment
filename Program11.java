//package Program;

import java.util.LinkedList;

public class Program11 {
public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    for(int i =0; i < list.size(); i++) {
        System.out.println("Index "+i+" : "+list.get(i));
    }
} 
}
