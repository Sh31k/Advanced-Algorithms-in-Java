
/*
 * 
 * Napravi rekurziju koja ce ispisati broj s kojim je pozvana, ali unazad.
 * 
 */

import java.util.Scanner;

public class Recursion1 {

	public static void rec(int num) {

		System.out.print(num % 10);

		if (num / 10 > 0) {
			rec(num / 10);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		rec(number);
	}

}
