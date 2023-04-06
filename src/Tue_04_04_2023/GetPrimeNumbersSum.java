package Tue_04_04_2023;

public class GetPrimeNumbersSum {

	public static int getPrimeNumbersSum(int start, int end) {
	   
	    if (start < 0 || end < 0) {
	        return -1;
	    }
	   
	    if (start == 0 || end == 0) {
	        return -2;
	    }
	   
	    if (start >= end) {
	        return -3;
	    }

	    int sum = 0;
	    for (int i = start; i <= end; i++) {
	        if (isPrime(i)) {
	            sum += i;
	        }
	    }
	    return sum;
	}

	
	public static boolean isPrime(int n) {
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		System.out.println(getPrimeNumbersSum(10, 20));
	}
}
