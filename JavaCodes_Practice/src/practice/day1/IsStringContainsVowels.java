package practice.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class IsStringContainsVowels {

	
	public static void isContainedVowel(String str) {
		str = str.toLowerCase();
		boolean flag = false;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a' | ch=='e' | ch=='i'| ch=='o'| ch=='u') {
				flag = true;
			}
		}
		if(flag)
			System.out.println("Given string contains vowels.");
		else
			System.out.println("Given string does not contain any vowels.");
	}
	
	public static void isContainsVowel_2(String str) {
		boolean flag = false;
		str = str.toLowerCase();
		String vowel = "aeiou";
		ArrayList<Character> vowels = new ArrayList<Character>();
		for(int i=0; i<vowel.length();i++) {
			vowels.add(vowel.charAt(i));
		}
		
		for (int j=0; j<str.length(); j++) {
			if(vowels.contains(str.charAt(j))) {
				flag = true;
			}
		}
		
		if(flag)
			System.out.println("Given string contains vowels.");
		else
			System.out.println("Given string does not contain any vowels.");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter string here ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		isContainedVowel(str);
		isContainsVowel_2(str);
		sc.close();		
	}

}
