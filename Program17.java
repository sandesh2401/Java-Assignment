import java.util.HashSet;

public class Program17 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.print(set);
        System.out.println();
        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);
        for(int a : arr) {
            System.out.print(+a+" ");
        }
    }
}
