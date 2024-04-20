//package Program;
import java.util.LinkedList;

public class Program10 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.print(list);
        list.addFirst(5);
        list.addLast(60);
        System.out.println();
        System.out.print(list);
    }
}
