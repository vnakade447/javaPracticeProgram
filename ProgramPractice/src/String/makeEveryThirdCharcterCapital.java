package String;

import java.util.Scanner;

public class makeEveryThirdCharcterCapital {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String str=sc.nextLine();
		
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String result="";
			for(int j=0;j<word.length();j++) {
				char ch=word.charAt(j);
				if(j%3==0) {
					result+=Character.toUpperCase(ch);
				}
				else {
					result+=ch;
				}
			}
			System.out.println(result);
		}
	}

}
