package homework_week9;

/**
 * Write a Java program to reverse an array of integer values
 */
public class Programme_3 {

    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {
        int a[] = {5, 10, 15, 20, 25, 30, 35, 40};

        System.out.println("Original Array: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nReversing Array: ");
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
    }
}
