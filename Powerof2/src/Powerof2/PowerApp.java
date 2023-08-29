package Powerof2;

import java.util.Scanner;

public class PowerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number");

		int num=scan.nextInt();

		Power p1=new Power();

		int res=p1.raiseToTwo(num);

		System.out.println(res);

		}

		}

	


