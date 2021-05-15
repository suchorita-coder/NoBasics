package OnNumber;

import java.util.Scanner;

class ArmstrongUserInput{  
	  public static void main(String[] args)  {  
	    int c=0,a,temp;
	    
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n=s.nextInt();//It is the number to check armstrong  
	    
	    temp=n;
	    
	    while(n>0)  
	    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("The number " +temp + "is armstrong number");   
	    else  
	        System.out.println( "The number " +temp + " is Not armstrong number");   
	   }  
	}  
