package homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6 {

    public static void main(String[] args) {
        retrieve();
    }

    public static void retrieve() {

        ArrayList hardware = new ArrayList();
        hardware.add("Computers");
        hardware.add("Mouse");
        hardware.add("keyboards");
        hardware.add("Joysticks");
        hardware.add("HardDisk");
        hardware.add("PenDrive");
        hardware.add("Printers");
        hardware.add("Scanners");

        System.out.println(hardware.get(5));
    }
}
