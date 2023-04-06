package wed_05_04_2023;

public class CountOddNumbersInArray {

	static String getOddCount(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++) {
		if(arr.length>5 || arr.length<5) {
			return "-1";
		}
		else if(arr[i]==0 || arr[i]<0) {
			return "-2";
		}
		else
			if(arr==null) {
				return "-4";
			}
		else if(arr[i]%2==0 && arr[i]==arr.length) {
			return "-3";
		}
			else {
				if(arr[i]%2!=0) {
					count++;
				}
			}
		
		
	}
		return " "+count;
		
	}
	public static void main(String[] args) {
		
 int arr[]= {2,4,5,6,7};
 System.out.println(getOddCount(arr));
	}

}
