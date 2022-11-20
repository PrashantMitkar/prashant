package programming;

import java.util.Scanner;

public class Even_or_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		sc.close();
		
		if(number%2==0) {
			System.out.println(number +"given number is even number");
		}else {
			System.out.println(number +"given number is odd number");	
		}
		
		
		

	}

}
