package homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7 {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(76);
        arrayList.add(4);
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add(" ");
        arrayList.add('Y');
        arrayList.add(45400);
        arrayList.add(true);
        arrayList.add(455.3055);
        arrayList.add(59.60f);
        arrayList.add(false);
        arrayList.add(" ");


        System.out.println(arrayList);
        boolean empty = arrayList.isEmpty();
        System.out.println(empty);
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(empty);

    }

}
