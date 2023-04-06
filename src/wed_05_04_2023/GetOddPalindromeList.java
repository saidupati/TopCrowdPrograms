package wed_05_04_2023;

public class GetOddPalindromeList {

	public static String getOddPalindromeList(int startNum, int endNum) {
	    if (startNum <= 0 || endNum <= 0) {
	        return "Error";
	    }
	    if (startNum > endNum || startNum < 100 || endNum > 999) {
	        return "Error";
	    }
	    String palindromeList = "";
	    for (int i = startNum; i <= endNum; i++) {
	        if (i % 2 == 0) { 
	            continue;
	        }
	        String numString = Integer.toString(i);
	        String reversedNumString = new StringBuilder(numString).reverse().toString();
	        if (numString.equals(reversedNumString)) {
	            palindromeList += i + ",";
	        }
	    }
	    if (palindromeList.isEmpty()) {
	        return "";
	    }
	    return palindromeList.substring(0, palindromeList.length() - 1); // Remove the last comma
	}
public static void main(String[] args) {
	System.out.println(getOddPalindromeList(100, 200));
}
}
