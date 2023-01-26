package studio1;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it?");
		int year = in.nextInt();
		boolean isLeapYear =( (year %4 == 0)&&(year%100 !=0)||(year%400 ==0));
	System.out.println(year+( " is a leap year: " + isLeapYear));
	}

}
