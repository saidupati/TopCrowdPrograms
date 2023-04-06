package wed_05_04_2023;

public class GetPalindromeList {

	public static String getPalindromeList(int n) {
	    if (n <= 0) { 
	        return "Error";
	    }
	    if (n < 100 || n > 999) { 
	        return "Error";
	    }
	    if (n / 100 == 0) { 
	        return "Error";
	    }
	    
	    String output = "";
	    int count = 0;
	    while (count < 10) {
	        output += n + ", "; 
	        if (isPalindrome(n)) {
	            return output.substring(0, output.length() - 2); 
	        }
	        n += reverse(n); 
	        count++;
	    }
	    return output.substring(0, output.length() - 2); 
	}

	private static int reverse(int n) { 
	    int rev = 0;
	    while (n != 0) {
	        rev = rev * 10 + n % 10;
	        n /= 10;
	    }
	    return rev;
	}

	private static boolean isPalindrome(int n) { 
	    return n == reverse(n);
	}
public static void main(String[] args) {
	String palindromeList = getPalindromeList(165);
	System.out.println(palindromeList); 

}
}
