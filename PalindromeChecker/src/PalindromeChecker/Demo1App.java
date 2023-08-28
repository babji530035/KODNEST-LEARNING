package PalindromeChecker;
//Non-Static method using boolean data type.................
//Non-Static method using boolean data type.................
//Non-Static method using boolean data type.................

import java.util.Scanner;

public class Demo1App {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	Demo1 jav=new Demo1();
	boolean res=jav.Palindrome(n);
	System.out.println(res);
	if(res) {
		System.out.println("The number is palindrome");

			}
	else {
		System.out.println("The number is not a palindrome");

		}


	}

}
