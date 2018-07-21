import java.util.Scanner;

public class EuclideanAlgorithm {

	public static int gcd(int a, int b) {

		if (b == 0)
			return a;

		a %= b;

		return gcd(b, a);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n, x, rj;
		System.out.print("Enter n: ");
		n = input.nextInt();
		
		System.out.print("Enter n numbers: ");
		rj = input.nextInt();

		for (int i = 0; i < n - 1; i++) {
			x = input.nextInt();
			rj = gcd(rj, x);
		}

		System.out.println("GCD is " + rj);

	}

}
