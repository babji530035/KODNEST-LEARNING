package Addition;

import java.util.Scanner;


public class Arithemetic {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		long n1=scan.nextLong();
			long n2=scan.nextLong();
			long res=galacticAddition(n1,n2);
			System.out.println(res);
			
			
			
		}
		public static long galacticAddition(long num1, long num2) {
			long num3=num1+num2;
			return num3;
			
		}
	}



