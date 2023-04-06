package Mon_03_04_2023;

public class SumOfRoundedValues {

	public static int sumOfRoundedValues(int a, int b, int c) {
	  
	    if (a <= 0 || b <= 0 || c <= 0) {
	        return -1;
	    }
	    
	  
	    int roundedA = roundToNearestTen(a);
	    int roundedB = roundToNearestTen(b);
	    int roundedC = roundToNearestTen(c);
	    
	    
	    return roundedA + roundedB + roundedC;
	}

	private static int roundToNearestTen(int num) {
	    int rightMostDigit = num % 10;
	    if (rightMostDigit < 5) {
	        return num - rightMostDigit;
	    } else {
	        return num + (10 - rightMostDigit);
	    }
	}
	public static void main(String[] args) {
		System.out.println(sumOfRoundedValues(23, 25, 37));
	}






}
