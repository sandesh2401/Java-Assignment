//package Program;
import java.util.ArrayList;
public class Program3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        int element = list.get(2);
        System.out.println("Element "+element);
    }
}
