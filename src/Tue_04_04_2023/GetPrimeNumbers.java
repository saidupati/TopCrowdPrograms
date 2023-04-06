package Tue_04_04_2023;

public class GetPrimeNumbers {

	public static String getPrimeNumbers(int start, int end) {
	    if (start < 0 || end < 0) {
	        return "-1";
	    }
	    if (start >= end) {
	        return "-2";
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = start; i <= end; i++) {
	        if (isPrime(i)) {
	            sb.append(i).append(" ");
	        }
	    }
	    return sb.toString().trim();
	}

	public static boolean isPrime(int num) {
	    if (num <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
public static void main(String[] args) {
	System.out.println(getPrimeNumbers(10, 20));
}
}
