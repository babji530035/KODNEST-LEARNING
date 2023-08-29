package Power_of_no.of_digits;

import java.util.Scanner;


public class MainApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		Main theCounting=new Main();

		int count = theCounting.countdigits(num);

		

		Main p1=new Main();

		int res=p1.raiseToTwo(num,count);

		System.out.println(res);
		

		
	}

}
