package Tue_04_04_2023;

public class CheckNumIsArmStrongOrNot {

	static String checkArmStrong(int num) {

		if (num < 0) {
			return "-1";
		}
		else if(num<1000 || num>9999) {
			return "-2";
		}
		else {
			int temp=num;
			int r,sum=0;
			while(num>0) {
				r=num%10;
				num=num/10;
				sum=sum+r*r*r*r;
			}
			if(temp==sum) {
				return "ArmStrong Number";
			}
			else {
				return "Not ArmStrong Number";
			}
		}
		

	}
	public static void main(String[] args) {
		System.out.println(checkArmStrong(4444));
	}
}
