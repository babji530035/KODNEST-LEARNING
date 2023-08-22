package SumofNaturalNumbersCalculator;

import java.util.Scanner;

public class Main

{

public static void calculateSum(int n)

{
 int Sum=0;
 for(int i=1;i<=n;i++) {
	 Sum=Sum+i;
 }
 System.out.println(Sum);


}

public static void main(String[] args)

{
	Scanner scan =new Scanner(System.in);
	int n= scan.nextInt();
	calculateSum( n);

}

}