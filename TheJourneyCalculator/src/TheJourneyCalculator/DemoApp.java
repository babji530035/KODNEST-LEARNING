package TheJourneyCalculator;
import java.util.Scanner;

public class DemoApp {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		Demo cal=new Demo();
		System.out.println(cal.calculateDistance(speed,time));
		
 }
}
