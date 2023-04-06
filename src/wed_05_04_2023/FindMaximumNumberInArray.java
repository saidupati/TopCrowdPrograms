package wed_05_04_2023;

public class FindMaximumNumberInArray {

	public static int findMax(int[] arr) {
		if (arr == null) {
			return 0;
		}
		int negativeCount = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negativeCount++;
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		if (negativeCount < 3) {
			return -1;
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, -7, -8, -1 };
		System.out.println(findMax(arr));
	}
}
