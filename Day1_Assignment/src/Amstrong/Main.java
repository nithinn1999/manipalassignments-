package Amstrong;

import java.util.Scanner;

/*To find whether a  number is Armstrong number */
public class Main {

	public static void main(String[] args) {
		 	int sum=0,k,temp;
		 	System.out.println("enter number to find amstrong or not");
		 	Scanner l = new Scanner(System.in);
			int n = l.nextInt();  
		    temp=n;  
		    while(n>0)  
		    {  
		    	k=n%10;  
		    	n=n/10;  
		    	sum=sum+(k*k*k);  
		    }  
		    if(temp==sum)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number"); 
	}

}
