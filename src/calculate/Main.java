package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner declaration for input data form console
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char choice;
        do {

            System.out.println("Enter First Number: ");
            int a = scanner.nextInt();
            System.out.println("Enter Second Number: ");
            int b = scanner.nextInt();
            System.out.println("Enter Mathematics symbol to perform operation:- [+,-,*,/] ");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(a,b,symbol);
            System.out.println("Do you like to Continue: Y for Yes, N for No:");
            choice = scanner.next().charAt(0);
        }
        while (choice=='Y'|| choice=='y');
        System.out.println("The Programme is Closed:");
        //Scanner close object
        scanner.close();
    }
}
