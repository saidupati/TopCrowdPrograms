package Thu_30_03_2023;

public class NaturalNumbersBetweenRangeOfTwoNumbers {

	static String getNaturalNumbers(int num1,int num2) {
		
		if(num1<0 || num2<0) {
			return "-1";
		}
		else if(num1==0 || num2==0) {
			return "-2";
		}
		StringBuilder sb=new StringBuilder();
		for(int i=num1+1;i<num2;i++) {
			sb.append(i).append(" ");
		}
		return sb.toString().trim();
	}
	public static void main(String[] args) {
		System.out.println(getNaturalNumbers(20, 30));
	}
}
