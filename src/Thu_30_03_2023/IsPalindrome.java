package Thu_30_03_2023;

public class IsPalindrome {

	static int isPalindrome(int num1,int rev) {
		
		 if(num1<=0) {
			return -1;
		}
		 else if(num1<100 || num1>999) {
			return -2;
		}
		
		else if(num1==rev) {
			return 1;
			
		}else
		{
			return 0;
		}
		
	}  
	public static void main(String[] args) {
		int num=67;
		 int rev=0;
		 int num1=num;
		 while(num!=0) {
			 rev=rev*10+num%10;
			 num=num/10;
		 }
		 System.out.println(isPalindrome(num1, rev));;
	}
}
