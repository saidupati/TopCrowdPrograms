package thus_06_04_2023;

public class DecryptingGivenText {

	public static String decrypt(String input) {
	    if (!input.matches("[a-z]+")) {
	        return null;
	    }

	    
	    String plainText = "abcdefghijklmnopqrstuvwxyz";
	    String cipherText = "zyxwvutsrqponmlkjihgfedcba";

	    
	    StringBuilder decrypted = new StringBuilder();

	  
	    for (int i = 0; i < input.length(); i++) {
	        
	        int index = cipherText.indexOf(input.charAt(i));
	        
	        decrypted.append(plainText.charAt(index));
	    }

	   
	    return decrypted.toString();
	}
public static void main(String[] args) {
	System.out.println(decrypt("xsgfhiuewr"));
}
}
