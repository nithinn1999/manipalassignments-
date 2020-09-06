package assign2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to vn hospitals");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the weight of the new born baby in kg:");
			float nit = sc.nextFloat();
			weight bw = new weight(nit);
			System.out.println(bw.calc(nit));
		}
	}

}
