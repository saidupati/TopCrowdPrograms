package Tue_04_04_2023;

public class GetSumOfTwoNumbers {

	static String getSum(int num1,int num2) {
		if(num1 <=0 || num2<=0) {
			return "Error";
		}
		else 
		{
			
			int sum= num1+num2;
			return sum+" ";
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(getSum(10,20));
	}
}
