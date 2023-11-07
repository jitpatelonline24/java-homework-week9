package homework_week9;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8 {

    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet();
        integers.add(13);
        integers.add(4);
        integers.add(45);
        integers.add(4);
        integers.add(7);
        integers.add(98);
        integers.add(8);
        integers.add(540);
        integers.add(20);
        integers.add(60);

        System.out.println("The Given numbers in the HashSet: " + integers);

        System.out.println("The numbers between 1 to 10 in the HashSet");

        for (int i = 1; i <= 10; i++) {
            if (integers.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
