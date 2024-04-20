//package Program;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(0, 10);
        System.out.print(list);
    }
}
