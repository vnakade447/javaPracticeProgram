package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class characterCountFromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				if(map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
				}
				else {
					map.put(str.charAt(i), 1);
				}
			}
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
		
	}

}
