package wed_05_04_2023;

public class GetFizzBizz {

	public static String getFizzBizz(int number) {
	    if (number <= 0) {
	        return "Error";
	    } else if (number % 3 == 0 && number % 5 == 0) {
	        return "FIZZBIZZ";
	    } else if (number % 3 == 0) {
	        return "FIZZ";
	    } else if (number % 5 == 0) {
	        return "BIZZ";
	    } else {
	        return Integer.toString(number);
	    }
	}
public static void main(String[] args) {
	System.out.println(getFizzBizz(15));
}

}
