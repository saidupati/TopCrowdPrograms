package Wed_15_03_2023;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingNumber {

	public static int firstRepeatingNumber(int arr[]) {
		
	
	Map<Integer,Integer> hashMap = new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hashMap.containsKey(arr[i])) {
			hashMap.put(arr[i],hashMap.get(arr[i])+1);
		}
		else {
			hashMap.put(arr[i],1);
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(hashMap.get(arr[i])>1) {
			return i+1;
		}
	}
	return -1;
	}
		public static void main(String[] args) {
			int arr[]= {1,5,3,4,3,5,6};
			System.out.println(firstRepeatingNumber(arr));
			int arr1[]= {1,2,3,4};
			System.out.println(firstRepeatingNumber(arr1));
		}
}
