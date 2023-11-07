package homework_week9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme_9 {

    public static void main(String[] args) {


        HashMap<String, Integer> fruits = new HashMap();
        fruits.put("Mango", 1);
        fruits.put("Apple", 2);
        fruits.put("Watermelon", 3);
        fruits.put("Pineapple", 4);
        fruits.put("Papaya", 5);
        fruits.put("Strawberry", 6);
        fruits.put("Plum", 7);
        fruits.put("Apricot", 8);
        fruits.put("Banana", 9);
        fruits.put("Grapes", 10);

        for (Map.Entry<String, Integer> fruit : fruits.entrySet()) {
            System.out.println(fruit.getKey() + "  : " + fruit.getValue());
        }
    }
}