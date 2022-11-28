package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraversalMethods {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Sharique");
        names.add("Arman");
        names.add("Ayan");
        names.add("Jigyashu");
        names.add("Neha");
        names.add("Binod");
        names.add("Sita");

        // For each loop
        System.out.println("__________For each loop____________________");
        for(String str:names)
        {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("__________Iterator____________________");

        // Forward Terversal using ITERATOR
        Iterator<String> itr = names.iterator();
        while (itr.hasNext())
        {
            String s = itr.next();
            System.out.println(s);
        }

        System.out.println("_________List Iterator______________________");
        // Backward Traversal using LIST_ITERATOR
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious())
        {
            String pre = litr.previous();
            System.out.println(pre);

        }
        System.out.println("__________For each method_____________________");

        //for each method
        names.forEach(str->{
            System.out.println(str);
        });

        System.out.println("Sort element using TreeSet");

        TreeSet<String> set=new TreeSet<>();
        set.addAll(names);

        set.forEach(e->{
            System.out.println(e);
        });
    }
}
