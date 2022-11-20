package programming;

import java.util.Scanner;

public class Vowel_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=sc.next().charAt(0);
		
		boolean isvowel=false;
		
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': isvowel=true;		
		}
		if(isvowel) {
			System.out.println(c + " " +"is a vowel");
			
		}else {
			System.out.println(c + " " +"is not a vowel");

		}
		sc.close();

	}

}
