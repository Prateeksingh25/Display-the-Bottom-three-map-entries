import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();


        treeMap.put("A", 101);
        treeMap.put("B", 202);
        treeMap.put("C", 303);
        treeMap.put("D", 404);
        treeMap.put("E", 505);
        treeMap.put("F", 606);

        int valueD = treeMap.get("D");
        System.out.println("Value of D: " + valueD);

        int valueE = treeMap.get("E");
        System.out.println("Value of E: " + valueE);

        int valueF = treeMap.get("F");
        System.out.println("Value of F: " + valueF);


        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
