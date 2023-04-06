package Wed_15_03_2023;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveMissingNumber {

	public static int findMissing(int arr[]) {
		
		
		Set<Integer> hashset = new HashSet<Integer>();
		for(int i=1;i<=arr.length;i++) {
		hashset.add(i);
		}
		for(int i=0;i<arr.length;i++) {
			if(hashset.contains(arr[i]))
			hashset.remove(arr[i]);
		}
		int missing=1;
		for(int x: hashset) {
			missing=x;
			
		}
		return missing;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7};
		System.out.println(findMissing(arr));;
		
	}
}
