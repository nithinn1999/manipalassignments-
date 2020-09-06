package assign2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state to know the tour places:");
		String nit = sc.next();
		switch(nit) {
		  case "karnataka":
			System.out.println("Below are the best places to visit:");
		    System.out.println(karnataka.show());
		    break;
		  case "delhi":
			System.out.println("Below are the best places to visit:");
			System.out.println(delhi.show());
		    break;
		  default:
		    System.out.println("Sorry I'm still training,I can assist you with following places:bangalore or delhi");
		}
	}

}
