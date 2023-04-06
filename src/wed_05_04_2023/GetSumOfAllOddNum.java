package wed_05_04_2023;

public class GetSumOfAllOddNum {

	
	static int getOddSum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		if(arr.length>5 || arr.length<5) {
			return -1;
		}
		else if(arr[i]==0 || arr[i]<0) {
			return -2;
		}
		else
			if(arr==null) {
				return -4;
			}
		else if(arr[i]%2==0 && arr[i]==arr.length) {
			return -3;
		}
			else {
				if(arr[i]%2!=0) {
					sum=sum+arr[i];
				}
			}
		
		
	}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,6,7,8};

System.out.println(getOddSum(arr));
	}

}
