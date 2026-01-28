import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); 

        set.remove("Python");

        System.out.println("Contains Java? " + set.contains("Java"));

        System.out.println("Set elements:");
        for (String lang : set) {
            System.out.print(lang + " ");
        }
    }
}
