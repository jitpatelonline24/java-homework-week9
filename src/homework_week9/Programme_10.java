package homework_week9;

import java.util.HashMap;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10 {

    public static void main(String[] args) {

        //Create a HashMap to store station name and their corresponding Tube lines
        HashMap<String, String> stationToLine = new HashMap();

        //Populate the hashMap with Zone1 London stations and their Tube Lines

        stationToLine.put("Paddington", "Bakerloo");
        stationToLine.put("Oxford Circus", "Victoria, Central, Bakerloo");
        stationToLine.put("Liverpool Street", "Central, Metropolitan,Circle, Hammersmith & City");
        stationToLine.put("MoorGate", "Circle, Hammersmith & City, Northern, Elizabeth");
        stationToLine.put("Edgware Road", "Circle, District, Hammersmith & City");


        String targetStation = "Oxford Circus";

        if (stationToLine.containsKey(targetStation)) {
            String lines = stationToLine.get(targetStation);
            System.out.println("Tube Lines passing through: " + targetStation + " : " + lines);
        } else {
            System.out.println("Station not found in Zone 1 London");;
        }
    }


}
