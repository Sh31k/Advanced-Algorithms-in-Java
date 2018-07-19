/*
 * 
 * Unesi n i ispisi sve n-cifrene brojeve u bazi 3.
 * 
 * Objasnjenje:
 * Prvi argument metode je trenutno stvoreni broj, a drugi zapisuje koliko jos cifara treba dodati.
 * 
 */

import java.util.Scanner;

public class Recursion2 {

	public static void rec(int x, int n) {

		if (n == 0) {
			System.out.print(x + " ");
			return;
		}

		for (int i = 0; i < 3; i++) {
			rec(x * 10 + i, n - 1);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		rec(1, number - 1);
		rec(2, number - 1);
	}

}
