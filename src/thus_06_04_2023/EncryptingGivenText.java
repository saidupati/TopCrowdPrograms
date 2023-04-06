package thus_06_04_2023;

public class EncryptingGivenText {

	public static String encrypt(String input) {
	    if (!input.matches("[a-z]+")) {
	        return null;
	    }

	    String plainText = "abcdefghijklmnopqrstuvwxyz";
	    String cipherText = "zyxwvutsrqponmlkjihgfedcba";

	    StringBuilder encrypted = new StringBuilder();

	    for (int i = 0; i < input.length(); i++) {
	        int index = plainText.indexOf(input.charAt(i));
	        encrypted.append(cipherText.charAt(index));
	    }

	    return encrypted.toString();
	}
public static void main(String[] args) {
	System.out.println(encrypt("prasannasai"));
}
}
