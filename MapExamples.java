package learn;
import java.util.*;
public class MapExamples {
    public static void main(String[] args) {

        HashMap<String,Integer> student=new HashMap<>();

        student.put("Sharique",101);
        student.put("Ram",102);
        student.put("Shayam",103);
        student.put("Radha",104);
        student.put("Mohan",105);

        System.out.println(student);

        student.forEach((key,value)->{
            System.out.print(key);
            System.out.print("->");
            System.out.println(value);
        });

    }

}
