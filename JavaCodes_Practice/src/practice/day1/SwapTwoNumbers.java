package practice.day1;

public class SwapTwoNumbers {
	
	public static void swapNums(int a, int b) {
		//swap two numbers using a third variable
		System.out.println("Original number 1 : "+a);	
		System.out.println("Original number 2 : "+b);
		
		int c = b;
		b=a;
		a=c;
		
		System.out.println("Number 1 after swapping : "+a);
		System.out.println("Number 2 after swapping : "+b);
		
	}
	public static void swapNumsWithoutThirdVar(int a, int b) {
		//swap two numbers without using a third variable
		System.out.println("Original number 1 : "+a);	
		System.out.println("Original number 2 : "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Number 1 after swapping : "+a);
		System.out.println("Number 2 after swapping : "+b);	
	}
	
	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		swapNums(a,b);
		swapNumsWithoutThirdVar(a, b);
		
	}

}
