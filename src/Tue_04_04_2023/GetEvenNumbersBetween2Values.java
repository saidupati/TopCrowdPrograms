package Tue_04_04_2023;

public class GetEvenNumbersBetween2Values {

	static String getEvenNumbers(int num1,int num2) {
		if(num1 <0 || num2<0) {
			return "-1";
		}
		else if(num1==0 || num2==0) {
			return "-2";
		}
		else
			if(num2<num1) {
				int sum=num1;
				num1=num2;
				num2=sum;
			}
		StringBuilder sb=new StringBuilder();
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
				sb.append(i+" ");
			}
		}
		return sb.toString().trim();
		
	}
	public static void main(String[] args) {
		System.out.println(getEvenNumbers(10, 20));
	}
}
