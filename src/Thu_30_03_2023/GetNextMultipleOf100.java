package Thu_30_03_2023;

public class GetNextMultipleOf100 {

	static int getNextMultipleOf100(int num) {
		if (num < 1)
			return -1;
		return ((num / 100) + 1) * 100;
	}

	public static void main(String[] args) {
		int num = 235;
		System.out.println(getNextMultipleOf100(num));
	}
}
