package Thu_30_03_2023;

public class ArrayMaximumSum {

	static int maximumSubarraySum(int[] arr) {
		int n=arr.length;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<=n;i++){
			int sum=0;
			for(int j=i;j<=n-1;j++) {
				sum+=arr[j];
				if(sum>maxSum) {
					maxSum=sum;
				}
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumSubarraySum(arr));
		int a[]= {};
	}
}
