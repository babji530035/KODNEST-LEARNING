package Armstrong_number;

import java.util.Scanner;

public class DemoApp {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	Demo d=new Demo();
	int res=d.check(n);
	
	if(res==n) {
		System.out.println(n +" is a Armstrong number ");
	}
	else {
		System.out.println(n +" is a not Armstrong number ");
	}
	}

	}


