import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20); 

        System.out.println("Element at index 1: " + list.get(1));

        list.set(2, 99);

        list.remove(Integer.valueOf(20));
        
        System.out.println("List elements:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
