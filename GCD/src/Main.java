import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			answer = GCD.gcd(a,b);
			System.out.println("GCD<"+a+", "+b+"> = "+answer);
		}
	}

}
