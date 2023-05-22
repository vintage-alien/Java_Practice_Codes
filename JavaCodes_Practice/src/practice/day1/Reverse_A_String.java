package practice.day1;

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert string - ");
		String str = sc.nextLine();
		String newStr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			newStr += str.charAt(i);
		}
		sc.close();
		
		System.out.println("Original string : "+str);
		System.out.println("Reversed string : "+newStr);
	}

}
