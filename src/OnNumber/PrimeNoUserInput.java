package OnNumber;

import java.util.Scanner;

public class PrimeNoUserInput {
	
	public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n = s.nextInt();
		 if(isPrime(n)) {
			 System.out.println("The number " +n+ " is prime");
		 } 
		 else {
			 System.out.println("The number " +n+ " is not prime");
		 }

			 
	}

	private static boolean isPrime(int n) {
		
		if(n<1) {
		
			return false;
		}
		
			for(int i = 2; i<= Math.sqrt(n); i++) {
				if(n%i ==0) {
					return false;
				}
			
		}
			return true;
	}

}
