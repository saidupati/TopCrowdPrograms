package Tue_04_04_2023;

public class CheckGivenNumberPrimeOrNot {

	static String checkPrime(int num) {
		if(num<0) {
			return "-1";
		}
		else if(num==0 || num==1) {
			return "-2";
		}
		else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					return "Given number is palindrome";
				}
			}
			return "Not a Palindrome";
		}
		
		
		
	}
	public static void main(String[] args) {
		System.out.println(checkPrime(110));
	}
}
