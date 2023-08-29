package Countno.ofdigits;

import java.util.Scanner;

public class CountApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number");

		int num=scan.nextInt();

		Count theCounting=new Count();

		int digit = theCounting.countdigits(num);

		System.out.println("number of digits in "+num+" is "+digit);

		}

		}

	


