package wed_05_04_2023;

public class GetTwinPrimes {

	public static String getTwinPrimes(int num1, int num2) {
	   
	    if (num1 < 0 || num2 < 0 || num1 > 100 || num2 > 100 || num1 >= num2) {
	        return "Error";
	    }

	    StringBuilder sb = new StringBuilder();
	    boolean foundTwinPrimes = false;

	    for (int i = num1; i <= num2 - 2; i++) {
	        if (isPrime(i) && isPrime(i + 2)) {
	            sb.append(i).append(",").append(i + 2).append(";");
	            foundTwinPrimes = true;
	        }
	    }

	    if (!foundTwinPrimes) {
	        return "No Twin Primes Found";
	    }

	    return sb.toString();
	}

	
	private static boolean isPrime(int num) {
	    if (num < 2) {
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
		System.out.println(getTwinPrimes(20, 90));
	}
}
