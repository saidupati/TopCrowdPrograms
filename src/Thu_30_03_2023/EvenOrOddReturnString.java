package Thu_30_03_2023;

public class EvenOrOddReturnString {

	static String isEvenOrOdd(int num) {
		if(num<=0) {
			return "Invalid Input";
		}
		else if(num%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
		
	}
	public static void main(String[] args) {
		System.out.println(isEvenOrOdd(22));
		System.out.println(isEvenOrOdd(35));
		System.out.println(isEvenOrOdd(-5));
		System.out.println(isEvenOrOdd(0));
	}
		
	}

