package Tue_04_04_2023;

public class WeavedString {

	public static String getWeavedString(String value1, String value2) {
	    if (value1.isBlank() || value2.isBlank()) {
	        return "-1";
	    }
	    if (value1.length() > value2.length()) {
	        return value2 + value1 + value2;
	    }
	    else if (value1.length() < value2.length()) {
	        return value1 + value2 + value1;
	    }
	    else {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < value1.length(); i++) {
	            result.append(value1.charAt(i)).append(value2.charAt(i));
	        }
	        return result.toString();
	    }
	}
	public static void main(String[] args) {
		System.out.println(getWeavedString("sai", "sai"));
	}
}
