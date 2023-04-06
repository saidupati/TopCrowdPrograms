package Wed_15_03_2023;

public class MaximumDifferenceOfTwoArrays {

	static void smallestSubArray() {
		int arr[]= {2, 7, 9, 5, 1, 3, 5};
		int k=7;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]-arr[i]==k) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
	public static void main(String[] args) {
		smallestSubArray();
	}
}
