package Armstrong_number;
public class Demo {
 public static int check(int n) {
	int sum=0;
	 while(n>0) {
		 int ld=n%10;
		 int cube = ld*ld*ld;
		 sum=sum+cube;
		 n=n/10;		 
	 }
return sum;	
}
}
