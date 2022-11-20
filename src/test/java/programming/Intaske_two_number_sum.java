package programming;

import java.util.Scanner;

public class Intaske_two_number_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int firstnumber=sc.nextInt();
		System.out.println("Enter second Number");
		int Secondnumber=sc.nextInt();
		sc.close();
		System.out.println("The sum of two number"+"firstnumber is" + " " +firstnumber +"Secondnumber is "+"  " + Secondnumber+ " = "+ (firstnumber+Secondnumber));
	}

}
