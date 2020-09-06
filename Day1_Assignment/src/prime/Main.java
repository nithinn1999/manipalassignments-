package prime;

import java.util.Scanner;



/* Finding a prime number*/
public class Main {

	public static void main(String[] args) {
		System.out.println("enter number to find prime or not");
		
		Scanner n = new Scanner(System.in);
		int l = n.nextInt();
		Boolean b = true;
		if (l<=1) 
	        b = false; 
	    for (int i = 2; i < l ; i++) 
	        if (l % i == 0) 
	            b = false; 
	  
	    if(b == false)
	    System.out.println("Not a prime number");
	    else
	    	System.out.println("prime number");
		
	}

}
