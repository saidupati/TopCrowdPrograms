package Thu_30_03_2023;

public class CountBoolean {

	static String countBoolean(boolean a,boolean b,boolean c) {
		
		if(a&&b ==true || b&&c ==true || c&&a ==true) {
			return "true";
		}
		else 
		
		return "false";
		
	}
	public static void main(String[] args) {
		System.out.println(countBoolean(false, true, true));;
	}
}
