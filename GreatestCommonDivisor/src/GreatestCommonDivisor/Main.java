package GreatestCommonDivisor;

import java.util.Scanner;

public class Main

{

public static void findGCD(int m, int n)

{  int gcd=1;
int rem=1;
while(n!=0) {
	rem=m%n;
	m=n;
	n=rem;
	
}
			gcd=m;
				
	
	System.out.println(gcd);


}
public static void main(String[] args)

{
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();

    findGCD(a,b);

}

}