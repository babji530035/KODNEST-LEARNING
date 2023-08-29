package Powerofn;

import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number");

		int num=scan.nextInt();

		System.out.println("Enter The Power To Which It Should Be Raised");

		int n=scan.nextInt();

		Demo p2 = new Demo();

		int res=p2.raiseToPowerN(num,n);

		System.out.println(res);

		}

		}

	


