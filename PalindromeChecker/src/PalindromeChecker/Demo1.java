package PalindromeChecker;

public class Demo1 {
	boolean Palindrome(int n){
		int ld=0;
		int sum=0;
		int temp=n;
		while(n>0) {
			ld=n%10;
			sum=(sum*10)+ld;
			n=n/10;
		}
	if(temp==sum) {
		return true;
	}
	else {
		return false;
	}

}
}
