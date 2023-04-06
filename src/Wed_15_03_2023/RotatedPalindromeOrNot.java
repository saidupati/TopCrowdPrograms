package Wed_15_03_2023;

public class RotatedPalindromeOrNot {

	
	    public static boolean isRotatedPalindrome(String str) {
	        String concatStr = str + str;
	        int n = str.length();
	        for (int i = 0; i < n; i++) {
	            String subStr = concatStr.substring(i, i + n);
	            if (isPalindrome(subStr)) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    private static boolean isPalindrome(String str) {
	        int i = 0;
	        int j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        String str1 = "CBAABCD";
	        String str2 = "BAABCC";
	        
	        System.out.println(str1 + " is a rotated palindrome: " + isRotatedPalindrome(str1));
	        System.out.println(str2 + " is a rotated palindrome: " + isRotatedPalindrome(str2));
	    }
	}


