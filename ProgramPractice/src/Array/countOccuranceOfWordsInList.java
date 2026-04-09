package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class countOccuranceOfWordsInList {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("java", "stream", "java", "code", "stream");
		
		Map<String, Long> result=words.stream()
				.collect(Collectors.groupingBy(w->w,Collectors.counting()));
		
		System.out.println(result);
	}

}
