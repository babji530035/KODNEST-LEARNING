package PalindromeChecker;

public class Demo2 {
	int Palindrome(int n){
		int ld=0;
		int sum=0;
		int temp=n;
		while(n>0) {
			ld=n%10;
			sum=(sum*10)+ld;
			n=n/10;
		
		}
		return sum;
	
	}


}
