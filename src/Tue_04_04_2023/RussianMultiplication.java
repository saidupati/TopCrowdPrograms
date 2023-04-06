package Tue_04_04_2023;

import java.util.Scanner;

public class RussianMultiplication {

	static int russian(int n1, int n2) {

		int res = 0;

		while (n2 > 0) {

			if ((n2 & 1) != 0) {

				res += n1;
			}
			n1 = n1 << 1;

			n2 = n2 >> 1;
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter even number:");

		int even = sc.nextInt();

		System.out.print("Enter odd number:");

		int odd = sc.nextInt();

		System.out.println(russian(even, odd));

	}
}
