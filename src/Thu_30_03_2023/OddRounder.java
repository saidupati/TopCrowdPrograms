package Thu_30_03_2023;

public class OddRounder {

	static int oddRounder(int num) {
		if(num<0) {
			return -1;
		}
		else if(num==0) {
			return -2;
		}
		else if(num%2==0) {
			return num;
		}
		else {
			return((num/10)+1)*10;
		}
	}
	public static void main(String[] args) {
		System.out.println(oddRounder(35));;
	}
}
