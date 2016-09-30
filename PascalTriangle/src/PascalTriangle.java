
public class PascalTriangle {

	/**
	 * Computes a binomial coefficient indexed by given n and k.
	 * 
	 * @param n
	 *            The row index of the binomial coefficient
	 * @param k
	 *            The column index of the binomial coefficient
	 * @return The binomial coefficient indexed by given n and k
	 */
	public static int computeBinomialCoef(int n, int k) {
		int answer;
		if(k==0 || n==k ){
			return 1;
		}
	
		answer =computeBinomialCoef(n-1,k-1)+computeBinomialCoef(n-1,k);
		
		return answer;
		
		// Fill your code to compute a binomial coefficient.
		// Note that you have to use recursive function call.
	}

	/**
	 * Prints a Pascal's triangle with n + 1 rows.
	 * 
	 * @param n
	 *            A number of rows in the triangle
	 */
	public static void drawPascalTriangle(int n) {
		// Fill your code to print a Pascal's triangle with n + 1 rows.
		// Hint 1: use computeBinomialCoef method multiple times.
		// Hint 2: use loop statements
		
		for(int i =0; i<=n;++i){
			for(int j=0; j<=i; ++j){
				System.out.print(String.valueOf(computeBinomialCoef(i,j))+" ");	
			}
			System.out.print("\n");
		}
		
	}

}
