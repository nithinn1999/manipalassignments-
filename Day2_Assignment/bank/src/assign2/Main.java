package assign2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		bank nith = new bank(13,"nithin");
		Scanner s = new Scanner(System.in);
	        System.out.println();
	        System.out.println("Select 1 for Deposition");
	        System.out.println("Select 2 to withdraw");
	        System.out.println("Select 3 to to exit");
	        System.out.println();
	        System.out.print("Enter choice [1-4]: ");
	        int nithin = s.nextInt();
	        
	        switch (nithin) {
	            case 1: 
	            		System.out.println("Enter a deposit amount:");
	            		double amount = s.nextDouble();
	            		System.out.println("Your Current Balance is :" +nith.credit(amount)); 
	                    break;
	            case 2: 
	                    System.out.println("Enter a withdraw amount");
	                    double amount1 = s.nextInt();
	                    System.out.println("Your Current Balance is :" +nith.debit(amount1) );
	                    break;
	            case 3:
	                System.exit(0);
	        }
	}
}
