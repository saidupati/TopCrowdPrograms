package Tue_04_04_2023;

public class CreateBoxPattern {

	public static String createBoxPattern(int rows, int columns) {
	   
	    if (rows < 1 || columns < 1) {
	        return "-1";
	    }
	   
	    if (rows == 0 || columns == 0) {
	        return "-2";
	    }
	   
	    StringBuilder boxPattern = new StringBuilder();
	    for (int i = 1; i <= rows; i++) {
	        for (int j = 1; j <= columns; j++) {
	            if (i == 1 || i == rows || j == 1 || j == columns) {
	                boxPattern.append("* ");
	            } else {
	                boxPattern.append("  ");
	            }
	        }
	        boxPattern.append("\n");
	    }
	    return boxPattern.toString();
	}
	public static void main(String[] args) {
		System.out.println(createBoxPattern(4, 5));
	}
}
