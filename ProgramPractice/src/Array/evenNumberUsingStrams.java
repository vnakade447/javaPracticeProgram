package Array;

import java.util.Arrays;
import java.util.List;

public class evenNumberUsingStrams {
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//List<int[]> number=Arrays.asList(arr);
		//number.stream().filter(n -> n % 2==0).forEach(System.out::println);
		
		Arrays.stream(arr).filter(n -> n%2==0).forEach(System.out::println);
	}

}
