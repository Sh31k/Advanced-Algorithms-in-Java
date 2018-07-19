/*
 * Ispisi sve permutacije niza "abcde".
 */

public class Permutations {

	public static void rec(int x, int n) { // permutacije brojeva
		
		int[] digits = new int[5];
		if (n == 0) {
			write(x + "");
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

	public static void write(String x) {

		for (int i = 0; i < 5; i++) {

			System.out.print((char) (x.charAt(i) + 48));
		}

		System.out.print(" ");
	}

	public static void main(String[] args) {

		rec(0, 5);

	}

}
