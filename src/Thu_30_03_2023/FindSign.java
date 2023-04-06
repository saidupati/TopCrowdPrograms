package Thu_30_03_2023;

public class FindSign {

	public static int findSign(int num) {
		if(num>0) {
			return 1;
		}
		else if(num<0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(findSign(5));
		System.out.println(findSign(-5));
		System.out.println(findSign(0));
	}
}
