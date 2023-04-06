package Thu_30_03_2023;

public class ReturnSquareOrCubeIfEvenOrOdd {

	public static int calculate(int num) {
		if(num<=0) {
			return -1;
		}
		else if(num%2==0) {
			return num*num;
		}
		else {
			return num*num*num;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(calculate(22));
		System.out.println(calculate(11));
		System.out.println(calculate(0));
		System.out.println(calculate(21));
	}
}
