package PalindromeChecker;
import java.util.Scanner;
public class Demo2App {
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
int n=scan.nextInt();
Demo2 d=new Demo2();
int sum= d.Palindrome(n);
		
if(sum==n) {
			System.out.println("The number is palindrome");

				}
		else {
			System.out.println("The number is not a palindrome");

			}


		}

}
