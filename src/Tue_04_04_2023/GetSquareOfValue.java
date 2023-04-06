package Tue_04_04_2023;

public class GetSquareOfValue {

	static int getSquare(int num) {
		if(num<0) {
			return -1;
		}
		else if(num==0) {
			return -2;
		}
		else 
		{
				int square=num*num;
				
						return square;
			}
			
			
		}
		public static void main(String[] args) {
			System.out.println(getSquare(5));
		}
}
