package Wed_15_03_2023;

import java.util.Arrays;

public class MaximumSumAmongAllSubArrays {

	public static int kadane(int[] arr)
    {

        int max = Arrays.stream(arr).max().getAsInt();
 
        if (max < 0) {
            return max;
        }

        int maxSoFar = 0;
         int maxEndingHere = 0;
 
        for (int i: arr)
        {
            maxEndingHere = maxEndingHere + i;
 
            maxEndingHere = Integer.max(maxEndingHere, 0);
 
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
 
        return maxSoFar;
    }
 
    public static void main(String[] args)
    {
        int[] arr = { -8, -3, -6, -2, -5, -4 };
 
        System.out.println("The sum of contiguous subarray with the " +
                        "largest sum is " +    kadane(arr));
    }
}
