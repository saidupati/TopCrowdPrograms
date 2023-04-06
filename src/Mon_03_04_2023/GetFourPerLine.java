package Mon_03_04_2023;

public class GetFourPerLine {
	public static String getFourPerLine(int value) {
	    if (value < 1 || value > 99) {
	        return "-3";
	    } else if (value == 0) {
	        return "-2";
	    } else if (value < 0) {
	        return "-1";
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    for (int i = 1; i <= value; i++) {
	        sb.append(i).append(" ");
	        if (i % 4 == 0) {
	            sb.append("\n");
	        }
	    }
	    
	    return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(getFourPerLine(17));
	}
}
