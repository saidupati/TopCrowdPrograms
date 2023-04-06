package Thu_30_03_2023;

public class getNumbersInRange {

	public static String getNumbersInRange(int start, int end, int step) {
	    // check for negative values
	    if (start < 0 || end < 0 || step < 0) {
	        return "-1";
	    }
	    // check for same values
	    if (start == end) {
	        return "-2";
	    }
	    // check for invalid range
	    if (start > end) {
	        return "-3";
	    }
	    // create StringBuilder to hold the result
	    StringBuilder result = new StringBuilder();
	    // iterate over the range and add each number to the result
	    for (int i = start + 1; i < end; i += step) {
	        result.append(i).append(" ");
	    }
	    // return the result as a String, trimmed of any extra whitespace
	    return result.toString().trim();
	}
public static void main(String[] args) {
	System.out.println(getNumbersInRange(10, 30, 2)); ;
}
}






