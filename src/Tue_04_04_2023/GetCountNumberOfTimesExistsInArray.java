package Tue_04_04_2023;

public class GetCountNumberOfTimesExistsInArray {

	public static int getCount(int[] arr, int val) {
	    if (arr == null || arr.length == 0) {
	        return -1;
	    }
	    
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == val) {
	            count++;
	        }
	    }
	    
	    return count;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,8,2,3,2};
		int key=5;
		System.out.println(getCount(arr, key));
	}
}
