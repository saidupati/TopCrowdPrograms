package Tue_04_04_2023;

public class NumberPattern4 {

	static String numberpattern(int num) {
		if(num<0) {
			return "-1";
		}
		else if(num==0) {
			return "-2";
		}
		else 
		{
			StringBuilder sb = new StringBuilder();
	        for (int i = 1; i <= num; i++) {
	            for (int j = 1; j <= i; j++) {
	                sb.append(i * j).append(" "); 
	            }
	            sb.append("\n"); 
	        }
	        return sb.toString().trim(); 
	    }
		
	
		
	}
	public static void main(String[] args) {
		System.out.println(numberpattern(5));
	}
}
