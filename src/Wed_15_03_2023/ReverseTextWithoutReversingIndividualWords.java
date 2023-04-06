package Wed_15_03_2023;

import java.util.Scanner;

public class ReverseTextWithoutReversingIndividualWords {

	
		 static void reverseWord() {
			 Scanner sc=new Scanner(System.in);
					 System.out.println("Enter a words");
			 String s[]
			            = sc.nextLine().split(" ");
			        String ans = "";
			        for (int i = s.length - 1; i >= 0; i--) {
			            ans += s[i] + " ";
			        }
			         
			        System.out.println(
			            ans.substring(0, ans.length() - 1));
			    }
		 
	    public static void main(String[] args)
	    {
	    reverseWord();    
	}
}

