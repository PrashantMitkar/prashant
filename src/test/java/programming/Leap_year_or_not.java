package programming;

import java.util.Scanner;

public class Leap_year_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
	//	int year = 2007;
		boolean isleapyear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isleapyear = true;
				} else {
					isleapyear = false;
				}

			} else {
				isleapyear = true;
			}

		} else {
			isleapyear = false;
		}
		if (isleapyear==true) {
			System.out.println("given year is :" + year + " " + "leap Year");
		} else {
			System.out.println("given year is :" + year + " " + "not leap Year");

		}
		sc.close();
	}

}
