package Thu_30_03_2023;

public class LeastAmongTwoNumbers {
	static int leastNumber(int num1,int num2) {
		if(num1<0 || num2<0) {
			return -1;
		}
		else if(num1==0 || num2==0) {
			return -2;
		}
		else {
			return Math.min(num1, num2);
		}
	}
	public static void main(String[] args) {
		System.out.println(leastNumber(5, 10));
		System.out.println(leastNumber(-5, 10));
		System.out.println(leastNumber(0, 10));
		System.out.println(leastNumber(5, 0));
	}

}
