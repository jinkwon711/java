import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String command = sc.next();
			int answer;
			if ("binomial".equals(command)) {
				int n = sc.nextInt();
				int k = sc.nextInt();
				answer= PascalTriangle.computeBinomialCoef(n,k);
				System.out.println(n+"C"+k+" = "+answer);
				// Fill your code to compute and print a binomial coefficient.
			} else if ("draw".equals(command)) {
				int n = sc.nextInt();
				System.out.println("Pascal Triangle ("+n+")");
				PascalTriangle.drawPascalTriangle(n);
								
			} else {
				break;
			}
		}
	}
	
}
