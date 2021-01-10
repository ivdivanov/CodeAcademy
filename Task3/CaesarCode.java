package Task3;

import java.util.Scanner;

public class CaesarCode {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type type in 1 if you wish to crypt or 2 if you wish to decypt");
		int cases = sc.nextInt();
		System.out.println("Please type in the value of the crypting:");
		int cryptValue = sc.nextInt();
		System.out.println("Lastly, please type in the text that you wish to be processed:");
		String textToBeProcessed = sc.next();
		
		switch (cases) {
		case 1:
			Crypt(textToBeProcessed,cryptValue);
			break;
		case 2:
			Decrypt(textToBeProcessed,cryptValue);
			break;
		default:
			System.out.println("Invalid key");
			break;
		}
		
	}
	
	
	public static void Crypt(String text, int value) {
		
		text = text.toUpperCase();
		String result = "";
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 65 && text.charAt(i) <= 90) {
				
				if (text.charAt(i) + value > 90) {
					result += (char)(text.charAt(i) + value - 26);
				}else {
					result += (char)(text.charAt(i) + value);
				}
			}
		}
		
		System.out.println(result);
		
	}
	
	public static void Decrypt(String text, int value) {
		
		text = text.toUpperCase();
		String result = "";
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 65 && text.charAt(i) <= 90) {
				
				if (text.charAt(i) - value < 65) {
					result += (char)(text.charAt(i) - value + 26);
				}else {
					result += (char)(text.charAt(i) - value);
				}
			}
		}
		
		System.out.println(result);
		
	}
	

}
