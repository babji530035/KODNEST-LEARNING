package PatternProgramming_Assessment;

public class Pattern_L {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i==n)
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
