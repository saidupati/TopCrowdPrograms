package Mon_03_04_2023;

public class GetNaturalNumbersInRange {

	public static String getNumbersInRange(int start_val, int end_val) {
	   
	    if (start_val < 0 || end_val < 0) {
	        return "-1";
	    }
	   
	    if (start_val == end_val) {
	        return "-2";
	    }
	   
	    if (start_val < end_val) {
	        return "-3";
	    }
	   
	    if (start_val - end_val == 1) {
	        return "-4";
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    for (int i = start_val - 1; i > end_val; i--) {
	        sb.append(i).append(" ");
	    }
	    return sb.toString().trim();
	}
	public static void main(String[] args) {
		System.out.println(getNumbersInRange(10, 2));
	}
}
