package wed_05_04_2023;

public class CreateAnArrayWithIncreaseAndDecreaseOrder {

	public static int[] getIncreaseDecrease(int n) {
	    if (n <= 1 || n > 20) {
	        return null;
	    }
	    int[] result = new int[2 * n - 1];
	    int index = 0;
	    for (int i = 1; i <= n; i++) {
	        result[index++] = i;
	        if (i != n) {
	            result[index++] = n - i + 1;
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = getIncreaseDecrease(5); 
		int[] arr2 = getIncreaseDecrease(8); 
		int[] arr3 = getIncreaseDecrease(-29); 
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	}

}
