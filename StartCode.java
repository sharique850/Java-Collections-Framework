package learn;
// import util package[all classes] for collection framework
import java.util.*;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Welcome to code java Collection Framework");

        /* List can be of two types...
           1. Generic list (Type safe) eg: ArrayList<Integer> arr=new ArrayList<>();
           2. Non generic list (UnType safe) eg: LinkedList list=new LinkedList();
        */
        ArrayList<String> names=new ArrayList<>();
        names.add("Sharique");
        names.add("Arman");
        names.add("Ayan");
        names.add("Jigyashu");
//        System.out.println(names);

        // To get the name of elements.
//        System.out.println(names.get(0));
//        System.out.println(names.get(2));

        // To remove elements.
//        System.out.println(names.remove("Ayan"));
//        System.out.println(names.remove(1));
//        System.out.println(names);

        // Perform operations in ArrayList
//        System.out.println(names.isEmpty());
//        System.out.println(names.size());
//        System.out.println(names);

        // Untype safe
        LinkedList list=new LinkedList();
        list.add("Shama");
        list.add(123);
        list.add(654.2545);
        list.add(true);
//        System.out.println(list);

        HashSet<Double> hset=new HashSet<>();
        hset.add(256.1454);
        hset.add(21.54);
        hset.add(1.3);
        hset.add(456.0);
        System.out.println(hset);

        TreeSet<Double> tset=new TreeSet<>();
        tset.addAll(hset);
        System.out.println(tset);
    }
}
