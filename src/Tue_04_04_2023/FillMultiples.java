package Tue_04_04_2023;

import java.util.Arrays;

public class FillMultiples {

	public static int[] getMultiplesArray(int number) {
        if (number <= 0) {
            return null;
        }

        int[] multiples = new int[10];
        for (int i = 0; i < multiples.length; i++) {
            multiples[i] = number * (i + 1);
        }

        return multiples;
    }

    public static void main(String[] args) {
        int[] result = FillMultiples.getMultiplesArray(5);
        System.out.println(Arrays.toString(result));
        // Output: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
    }
}
