package labelledDoWhile;

public class Demo {
public static void main(String[] args) {
	int m=1;
	bob:do {
		int n=1;
		anu:do {
			System.out.print("Kodnest ");
			n++;			
		}while(n<=5);
		break anu;
		
		System.out.println();
		m++;
	}while(m<=5);
	
	
		System.out.println("Tech");

	}

}
