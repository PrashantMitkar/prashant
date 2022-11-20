package programming;

import java.util.Scanner;

public class Quotient_and_remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entet First number");
		int firstnumber = sc.nextInt();
		System.out.println("Entet Second number");
		int secondnumber = sc.nextInt();
		
		sc.close();
		
		System.out.println("Quotient is : "+ "  "+ (firstnumber/secondnumber));
		System.out.println("Remainder is : " + " "+ (firstnumber%secondnumber));
		
		
	}

}
