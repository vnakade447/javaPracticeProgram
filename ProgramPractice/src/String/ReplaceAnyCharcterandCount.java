package String;

import java.util.Scanner;

public class ReplaceAnyCharcterandCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		
		String str2=str.replaceAll("a", "");
		System.out.println("new String is : "+str2);
		int count=str.length()-str2.length();
		System.out.println("charcter count is : "+count);
	}

}
