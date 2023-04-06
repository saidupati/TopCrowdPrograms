package wed_05_04_2023;

public class GetCollatzSequence {

	public static String getCollatzSequence(int num) {
	    if (num <= 0) {
	        return "Error";
	    }
	    
	    StringBuilder sequence = new StringBuilder();
	    sequence.append(num);
	    sequence.append(" ");
	    
	    for (int i = 1; i <= 100; i++) {
	        if (num == 1) {
	            return sequence.toString().trim();
	        }
	        
	        if (num % 2 == 0) {
	            num /= 2;
	        } else {
	            num = num * 3 + 1;
	        }
	        
	        sequence.append(num);
	        sequence.append(" ");
	    }
	    
	    return "Does not Converge";
	}
public static void main(String[] args) {
	System.out.println(getCollatzSequence(7));;
}
}
