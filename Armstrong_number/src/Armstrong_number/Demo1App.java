package Armstrong_number;

import java.util.Scanner;

public class Demo1App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Demo1 d=new Demo1();
		boolean res=d.isArmstrong(num);
		if(res) {
			System.out.println(num +" is a Armstrong number");
		}
		else {
			System.out.println(num +" is not a Armstrong number");
		}
			
		
	}

}
