package programming;

import java.util.Scanner;

public class Powar_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int intialnumber=number;
		System.out.println("Enter a Power");
		int power=sc.nextInt();
		 sc.close();
		 
		 //logic for number of the power
		 
		 for(int i=1;i<power;i++) {
			 number=intialnumber*number;
		 }
		 System.out.println(intialnumber+ " " +"is a number "+ power +"poewer is a"+"="+number);
		 

	}

}
