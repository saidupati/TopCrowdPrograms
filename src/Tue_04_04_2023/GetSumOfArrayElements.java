package Tue_04_04_2023;

public class GetSumOfArrayElements {

	static String getSum(int arr[]) {
		int sum=0;
		if(arr.length==0 || arr==null) {
			return "-1";
		}
		
		else {
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
		}
		return " "+sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {10,20,30,40,50};
		System.out.println(getSum(arr));
	}

}
