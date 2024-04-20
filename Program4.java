//package Program;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Program4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(65);
        list.add(15);
        list.add(10);
        list.add(580);
        System.out.println(list);
        //Collections.sort(list);
        list.sort(null);
        System.out.println(list);
    }
}
