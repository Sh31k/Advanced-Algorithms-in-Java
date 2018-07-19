/*
 * 
 * Ispisi sve varijacije bez ponavljanja brojeva 1, 2, 3, 4 i 5 duzine 3.
 * Objasnjenje:
 * 
 * U polje spremamo cifre koje su vec u broju i ne mozemo ih koristiti.
 * U 27 liniji pozivamo rekurziju za onu cifru koju mozemo korisiti.
 * 
 */

public class Recursion3 {

	public static void rec(int x, int n) {
		int[] digits = new int[5];
		if (n == 0) {
			System.out.print(x + " ");
			return;
		}

		int xx = x;
		while (xx > 0) {
			digits[xx % 10 - 1] = 1; // zadnja cifra -1, zbog memorije
			xx /= 10;
		}

		for (int i = 1; i <= 5; i++) {
			if (digits[i - 1] == 0) {
				rec(x * 10 + i, n - 1);
			}
		}
	}

	public static void main(String[] args) {

		rec(0, 3);

	}

}
