package homework_week9;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop
 */
public class Programme_2 {

    public static void main(String[] args) {

        //Scanner declaration for input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("|                          |");
        System.out.println("|       Mark Sheet         |");
        System.out.println("|--------------------------|");
        System.out.println("      Enter the Name:        |");
        String name = scanner.next();
        System.out.println("|     Enter the Roll no:     |");
        int rno = scanner.nextInt();
        System.out.println("|-----------------------------|");
        System.out.println("|   Subject: Marks           |");
        System.out.println("|----------------------------|");
        markSheetCalculation();
        scanner.close();
    }

    public static void markSheetCalculation() {
        Scanner scanner = new Scanner(System.in);
        int m, s, e;
        while (true) {
            System.out.println("Enter Maths marks:    ");
            m = scanner.nextInt();
            if (m >= 0 && m <= 100) {
                break;
            } else {
                System.out.println("Invalid input, Marks should be between 0 to 100");
            }
        }
        while (true) {
            System.out.println("Enter Science Marks:       ");
            s = scanner.nextInt();
            if (s >= 0 && s <= 100) {
                break;
            } else {
                System.out.println("Invalid input, Marks should be between 0 to 100");
            }
        }
        while (true) {
            System.out.println("Enter English Marks:        ");
            e = scanner.nextInt();
            if (e >= 0 && e <= 100) {
                break;
            } else {
                System.out.println("Invalid input, Marks should be between 0 to 100");
            }
        }
        int total = m + s + e;
        double percentage = total * 100 / 300;

        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }
        String result;

        if (percentage <= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        if (m < 35 || s < 35 || e < 35) {
            result = "Fail";
        } else {
            result = "Pass";
        }
        System.out.println("-----------------------------");
        System.out.println("Total : " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
        System.out.println("Grade : " + grade);
        System.out.println("------------------------------");
        scanner.close();
    }
}