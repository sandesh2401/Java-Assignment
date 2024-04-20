//package Program;

import java.util.HashSet;
import java.util.Iterator;

public class Program15 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        Integer element = null;
        Iterator<Integer> itr = set.iterator();
       
        while(itr.hasNext()) {
            element = itr.next();
            System.out.println(element);
        }
    }
}
