package Thu_30_03_2023;

public class GetDiffOfDigits {
	
	static int getDiffOfDigits(int num) {
		if (num > 99)
			return -2;
		if (num < 10)
			return -3;
		int num1 = num / 10, num2 = num % 10;
		return (num1 - num2);
	}

	public static void main(String[] args) {
		int num = 83;
		System.out.println(getDiffOfDigits(num));
	}

}
