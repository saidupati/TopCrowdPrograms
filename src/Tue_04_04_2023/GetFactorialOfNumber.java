package Tue_04_04_2023;

public class GetFactorialOfNumber {

	static int getFactorial(int num) {
		int fact=1;
		if(num<0) {
			return -1;
		}
		else if(num==0) {
			return -2;
		}
		else
		{
			
			for(int i=1;i<=num;i++) {
				fact*=i;
			}
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFactorial(3));
	}

}
