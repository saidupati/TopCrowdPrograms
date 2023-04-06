package Mon_03_04_2023;

public class GetSumOfFactors {

	public static int getSumOfFactors(int n) {
	    if (n < 0) {
	        return -1;
	    } else if (n == 0) {
	        return -2;
	    } else {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                sum += i;
	            }
	        }
	        return sum;
	    }
	}
	public static void main(String[] args) {
		System.out.println(getSumOfFactors(3));
	}
}
