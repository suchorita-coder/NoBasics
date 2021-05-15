package OnNumber;

import java.util.Scanner;

class FactorialRecur{  
	 static int factorial(int n){    
	  if (n == 0)    
	    return 1;    
	  else    
	    return(n * factorial(n-1));    
	 }  
	 
	 public static void main(String args[]){  
		  int i,fact=1;
		  //It is the number to calculate factorial 
		  Scanner s = new Scanner (System.in);
		  System.out.println("Enter the no :" );
		  int n =s.nextInt();
		  fact = factorial(n);   
		  System.out.println("Factorial of "+n+" is: "+fact);    
	 }  
	}  