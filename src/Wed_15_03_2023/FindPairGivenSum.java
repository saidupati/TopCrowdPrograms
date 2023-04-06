package Wed_15_03_2023;

public class FindPairGivenSum {

	static void findPairSum() {
		int arr[]= {8, 7, 2, 5, 3, 1};
		int target=10;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             findPairSum();
	}

}
