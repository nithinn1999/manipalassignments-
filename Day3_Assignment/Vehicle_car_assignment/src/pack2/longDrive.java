package pack2;

import pack1.car;

public class longDrive {

	public static void main(String[] args) {
		
		car car = new car(1947,"Q3",40,160,"sedan");
		
		System.out.println(car.start());
		
				
		System.out.println(car.increaseSpeed(160));
		
		System.out.println(car.start());
		
		System.out.println(car.increaseSpeed(12));
			
		System.out.println(car.stop());
	}

}