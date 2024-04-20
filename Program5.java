//package Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthStyleFactory;


public class Program5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //Iterator<Integer> itr = list.iterator();
        ListIterator<Integer> itr = list.listIterator();
        Integer element = null;
        while(itr.hasNext()) {
            element = itr.next();
            System.out.print(element+" ");
        }
        System.out.println();
        while(itr.hasPrevious()) {
            element = itr.previous();
            System.out.print(element+" ");
        }
    }
}
