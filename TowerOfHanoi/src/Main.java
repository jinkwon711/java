import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		while (sc.hasNext()) {
			int n = sc.nextInt();
		System.out.println("Move "+n+" rings!");
		answer = TowerOfHanoi.towerOfHanoi(n, 3, 2, 1);
		System.out.println("solve with "+answer+" moves!");
		
		}
		
		sc.close();
	}

}
