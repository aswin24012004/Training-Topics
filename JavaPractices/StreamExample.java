package practices.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String args[]) {
		
		List<String> names = Arrays.asList("Aswin", "Raj", "Anu", "Arun");
		
		List<String> result = names.stream()
				.filter(name -> name.startsWith("A"))
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(result);

        List<Integer> list = Arrays.asList(5, 3, 2, 5, 1, 3, 4);
		
		list.stream()
			.distinct()
			.sorted()
			.forEach(System.out :: print);
			}
	}
}
