package Wed_15_03_2023;

public class LongestSubstringStringContainingDistinctCharacters {

	
	private static final int CHAR_RANGE = 128;
	
    public static String findLongestSubstring(String s)
    {
       
        if (s == null || s.length() == 0) {
            return s;
        }
 
        boolean[] window = new boolean[CHAR_RANGE];
 
        int begin = 0, end = 0;
 
        for (int low = 0, high = 0; high < s.length(); high++)
        {
            if (window[s.charAt(high)])
            {
                while (s.charAt(low) != s.charAt(high))
                {
                    window[s.charAt(low)] = false;
                    low++;
                }
 
                low++;       
            }
            else {
               
                window[s.charAt(high)] = true;
 
                
                if (end - begin < high - low)
                {
                    begin = low;
                    end = high;
                }
            }
        }
 
      
        return s.substring(begin, end + 1);
    }
 
    public static void main(String[] args)
    {
        String s = "longestsubstr";
 
        System.out.print(findLongestSubstring(s));
    }
}
