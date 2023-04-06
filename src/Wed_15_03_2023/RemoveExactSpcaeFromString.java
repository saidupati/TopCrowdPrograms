package Wed_15_03_2023;

public class RemoveExactSpcaeFromString {
	
	public static String removeSpaces(String s) {
	    int n = s.length();
	    int i = 0, j = -1;
	    boolean spaceFound = false;
	   
	    while (j < n - 1 && s.charAt(j + 1) == ' ') {
	        j++;
	    }
	   
	    while (j < n) {
	        
	        if (s.charAt(j) != ' ') {
	            
	            if ((s.charAt(j) == '.' || s.charAt(j) == ',' ||
	                 s.charAt(j) == '?') && i - 1 >= 0 &&
	                 s.charAt(i - 1) == ' ') {
	                s = s.substring(0, i - 1) + s.charAt(j) + s.substring(i);
	                j++;
	            } else {
	                //
	                s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1);
	                i++;
	                j++;
	            }
	           
	            spaceFound = false;
	        } else if (s.charAt(j) == ' ') {
	           
	            if (!spaceFound) {
	                s = s.substring(0, i) + ' ' + s.substring(i + 1);
	                i++;
	                spaceFound = true;
	            }
	            j++;
	        }
	    }
	     
	    if (i <= 1) {
	        s = s.substring(0, i);
	    } else {
	        s = s.substring(0, i - 1);
	    }
	    return s;
	}
	 

	public static void main(String[] args) {
	    String str = "   Hello sai . Welcome   to  Ojas"
	            + "  How    are u   .    ";
	    str = removeSpaces(str);
	    System.out.println(str);
	}

}
