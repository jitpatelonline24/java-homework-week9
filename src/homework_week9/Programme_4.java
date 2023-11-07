package homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4 {

    public static void main(String[] args) {

        ArrayList<String> coloursList = new ArrayList();

        coloursList.add("White");
        coloursList.add("Blue");
        coloursList.add("Red");
        coloursList.add("Black");
        coloursList.add("Green");
        coloursList.add("Violet");
        coloursList.add("Indigo");
        coloursList.add("Orange");
        coloursList.add("Yellow");
        coloursList.add("Pink");

        System.out.println(coloursList);

        for (String colours : coloursList) {          //For loop for Iteration
            System.out.print("[" + colours + "] ");
        }
    }
}
