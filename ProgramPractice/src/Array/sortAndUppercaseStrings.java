package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortAndUppercaseStrings {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Alice", "Bob", "Ananad","Amanda", "Charles");
		
		List<String> result=list.stream().filter(name-> name.startsWith("A"))
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
