package TheTemperatureConverter;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double F=scan.nextDouble();
	Demo temperatureConverter=new Demo();
	System.out.println(temperatureConverter.convertFahrenheitToCelsius(F));
		
	}

}
