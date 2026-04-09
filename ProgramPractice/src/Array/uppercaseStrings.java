package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uppercaseStrings {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("java", "streams", "practice");
		
		List<String> uppercaseWords=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseWords);
	}

}
