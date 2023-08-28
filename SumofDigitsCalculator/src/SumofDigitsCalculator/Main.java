package SumofDigitsCalculator;

import java.util.Scanner;

public class Main {
public static void calculateSumOfDigits(int n)

	{ int last digit=0;
	int sum=0;
     while(n>0) {
    	 lastdigit=n%10;
    	 sum=sum+lastdigit;
    	 n=n/10;
    	 
     }
     System.out.println(sum);
	

	}

	public static void main(String[] args)

	{

	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	calculateSumOfDigits(n);

	}	

}
