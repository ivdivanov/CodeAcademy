package Task2;

import java.util.Scanner;

public class PrintPatterns {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type in the size of the pattern that you wish to see");
		int data = sc.nextInt();

		System.out.println("Now type in the patern that you wish to see: " + "\n" + "1. Pyramid" + "\n" + "2. Reversed Pyramid" + "\n" + "3. Both");
		int cases = sc.nextInt();
		switch (cases) {
		case 1:
			printPRM(data);
			break;
		case 2:
			printPRMrvs(data);
			break;
		case 3:
			printPRM(data);
			printPRMrvs(data);
			break;
		default:
			System.out.println("Invalid key");
			break;
		}
		
		
		
		
	}
	
	
	static void printPRM(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for (int whitespaces = 0; whitespaces < (n) - i; whitespaces++) {
				System.out.print(" ");
			}
			
			for (int Hashtag = 0; Hashtag <= i; Hashtag++) {
				
				if (Hashtag == i) {
					System.out.print("#");
				}
				else 
				{
					System.out.print("# ");
				}
			}
			System.out.println();
					
		}	
		
	}
	
	static void printPRMrvs(int n) {
		
		for (int i = n; i > 0; i--) {
			
			for (int whitespaces = 0; whitespaces <= (n) - i; whitespaces++) {
				System.out.print(" ");
			}
				
			for (int j = 0; j < i; j++) {
				
				if (j == i) {
					System.out.print("#");
				}
				else 
				{
					System.out.print("# ");
				}
			}
						
			System.out.println();
					
		}	
		
	}

	

}
