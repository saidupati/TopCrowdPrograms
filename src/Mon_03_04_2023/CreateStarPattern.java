package Mon_03_04_2023;

public class CreateStarPattern {

	public static String createStarPattern(int num) {
		if(num<0) {
			return "-1";
		}
		else if(num==0) {
			return "-2";
		}
		else {
			StringBuilder cb=new StringBuilder();
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++) {
					cb.append("* ");
				}
				cb.append("\n");
			}
			return cb.toString();
		}
	
		
		
		
	}
	public static void main(String[] args) {
		System.out.println(createStarPattern(3));
	}
}
