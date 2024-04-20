//package Program;

import java.util.LinkedList;

public class Program12 {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    
    Integer key = 30;
    if(list.contains(key)) {
        System.out.println(key+" is exists");
    }
    else {
        System.out.println(key+" is not exists");
    }
    }
}
