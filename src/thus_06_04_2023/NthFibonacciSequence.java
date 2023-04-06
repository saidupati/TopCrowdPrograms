package thus_06_04_2023;

public class NthFibonacciSequence {

	public static int getNthTermOfFibonacciSeries(int n) {
	    if (n <= 0) {
	        return -1;
	    } else if (n == 1 || n == 2) {
	        return n - 1;
	    } else {
	        int a = 0;
	        int b = 1;
	        int c = 0;
//	        System.out.println(a+"\n"+b);
	        for (int i = 3; i <= n; i++) {
	            c = a + b;
//	            System.out.println(c);
	            a = b;
	            b = c;
	        }
	        return c;
	    }
	}
public static void main(String[] args) {
	System.out.println(getNthTermOfFibonacciSeries(10));
}
}
