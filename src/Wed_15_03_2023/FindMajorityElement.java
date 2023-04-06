package Wed_15_03_2023;

public class FindMajorityElement {

	static int findMajorityElementNaive(int nums[], int n)
	{
	    // check whether `nums[i]` is a majority element or not
	    for (int i = 0; i <= n/2; i++)
	    {
	        int count = 1;
	        for (int j = i + 1; j < n; j++)
	        {
	            if (nums[j] == nums[i]) {
	                count++;
	            }
	        }
	 
	        if (count > n/2) {
	            return nums[i];
	        }
	    }
	 
	    return -1;
	}
	public static void main(String[] args) {
		int nums[]= {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
		int n=nums.length;
		System.out.println(findMajorityElementNaive(nums, n));;
	}
}
