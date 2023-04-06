package Thu_30_03_2023;

public class EvenReturn {

	public static int isEven(int num) {
		if(num<=0) {
			return -1;
		}
		else if(num%2==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(isEven(22));
		System.out.println(isEven(35));
		System.out.println(isEven(-5));
		System.out.println(isEven(0));
	}
}
