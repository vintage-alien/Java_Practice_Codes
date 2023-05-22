package practice.day1;


import java.util.Scanner;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentense - ");
		String sent = sc.nextLine();
		sc.close();
		
		String desiredSent = "";
		String[] words = sent.split(" ");
		for (String word : words) {
			String revWord = "";
			for(int i=word.length()-1; i>=0; i--) {
				revWord += word.charAt(i);
			}
			desiredSent += revWord+" ";
		}
		System.out.println("Original sentense : " +sent);
		System.out.println("Sentense with reversed words: " +desiredSent.stripTrailing());
		
		

	}

}
