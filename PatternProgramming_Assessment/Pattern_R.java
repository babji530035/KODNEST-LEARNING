package PatternProgramming_Assessment;

public class Pattern_R {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0||(j==n && i<=n/2)||i==n/2||(i==j && j>=n/2))
				System.out.print("*");
				else
				System.out.print(" ");	
			}
			System.out.println();
		}

	}

}
