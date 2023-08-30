package Armstrong_number;

public class Demo {
 public static int check(int n) {
	int sum=0;
	int ld=1;
	int cube=0;
	 while(n>0) {
		 ld=n%10;
		 cube = ld*ld*ld;
		 sum=sum+cube;
		 n=n/10;
		 
	 }
return sum;	
}
}
