package programming;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radiys of a circle");
		
		double radius = sc.nextDouble();
		sc.close();
		
		System.out.println("radius of a cicle is" +" "+radius + " is = "+ (Math.PI* radius* radius) );

	}

}
