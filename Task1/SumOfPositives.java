package Task1;

import java.util.Scanner;

public class SumOfPositives {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double highestValue = 0;
		double lowestValue = 0;
		double result = 0;
		double tempValue;
		boolean working = true;
		
		while (working) {
			
			System.out.print("Please type in a positive number: " );
			tempValue = sc.nextDouble();
			
			if (tempValue <= 0) {
				System.out.println("You have entered a number equal to 0 or less; therefor the calculation will end with the following values: " + "\n" +
						" Sum value is: " + String.format("%.02f", result) + "\n" + " Highest value is " + highestValue + "\n" +
						" Lowest value is " + lowestValue);
				working = false;
				
			}
			else {
				if (highestValue == 0 && lowestValue == 0) {
					highestValue = tempValue;
					lowestValue = tempValue;
				}
				else
				{ 
					if (highestValue < tempValue) {
						highestValue = tempValue;
					}
					if (lowestValue > tempValue) {
						lowestValue = tempValue;
					}
				}	
				
				result += tempValue;
			}
		}
		
		
		
	}

}
