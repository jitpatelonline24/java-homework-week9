package homework_week9;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class Programme_5 {
    public static void main(String[] args) {
        myList();
    }
        public static void myList(){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Elephant");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Jaguar");
        animals.add("Hippo");
        animals.add("Bear");
        animals.add("Alligator");
        animals.add("Panther");

        System.out.println(animals);

        ListIterator<String> iterator = animals.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
