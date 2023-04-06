package Mon_03_04_2023;

public class GetFactors {

	public static String getFactors(int num) {
		if(num<0) {
			return "-1";
		}
		else if(num==0) {
			return "-2";
		}
		else 
		{
			String fac=" " ;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					fac+=i+" ";
				}
					
				}
			return fac.trim();
			}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFactors(28));
	}

}
