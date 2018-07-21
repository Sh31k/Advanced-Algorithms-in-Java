import java.util.Scanner;

public class LCM {

	public static int gcd(int a, int b) {

		if (b == 0)
			return a;

		a %= b;

		return gcd(b, a);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = input.nextInt();

		System.out.print("Enter second number: ");
		int b = input.nextInt();

		System.out.println("LCM is: " + a * b / gcd(a, b));

	}

}
