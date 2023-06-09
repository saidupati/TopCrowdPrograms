package Wed_15_03_2023;

public class LongestIncreasingSubsequence {

	public static int longestSubsequence(int[] arr, int i, int n, int prev)
    {
        if (i == n) {
            return 0;
        }
 
        int excl = longestSubsequence(arr, i + 1, n, prev);
 
        int incl = 0;
        if (arr[i] > prev) {
            incl = 1 + longestSubsequence(arr, i + 1, n, arr[i]);
        }
 
        return Integer.max(incl, excl);
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
 
        System.out.print("The length of the LongestSubsequence is "
                        + longestSubsequence(arr, 0, arr.length, Integer.MIN_VALUE));
    }
}
