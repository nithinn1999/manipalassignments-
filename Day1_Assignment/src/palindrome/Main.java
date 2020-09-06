package palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter number to find amstrong or not");
	 	Scanner l = new Scanner(System.in);
	 	int rm,sum=0,temp;
		int n = l.nextInt();  
		 temp=n;  
		    while(n>0)  
		    {  
		    	rm=n%10;  
		    	n=n/10;  
		    	sum=(sum*10)+rm;  
		    }  
		    if(temp==sum)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number"); 

	}

}
