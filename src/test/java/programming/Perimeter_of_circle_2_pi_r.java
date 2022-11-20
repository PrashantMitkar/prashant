package programming;

import java.util.Scanner;

public class Perimeter_of_circle_2_pi_r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radiys of a circle");
		
		double radius = sc.nextDouble();
		sc.close();
		
	System.out.println("Perimeter of circle is : " +(2*Math.PI*radius));
	}

}
