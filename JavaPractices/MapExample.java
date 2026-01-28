import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Aswin");
        map.put(2, "Kumar");
        map.put(3, "Java");

        map.put(3, "Full Stack");

        System.out.println("Key 1 value: " + map.get(1));

        map.remove(2);

        System.out.println("Map elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
