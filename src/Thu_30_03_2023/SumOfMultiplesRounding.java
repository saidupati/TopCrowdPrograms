package Thu_30_03_2023;

public class SumOfMultiplesRounding {

	static int sumOfMultiples(int num1,int num2,int num3) {
		int sum=num1+num2+num3;
		if(num1<=0 || num2<=0 || num3 <=0) {
			return -1;
		}
		else if(sum%10==0) {
			return sum;
		}
		else {
			return((sum/10)+1)*10;
		}
	}
	public static void main(String[] args) {
		System.out.println(sumOfMultiples(10, 25, -30));
	}
}
