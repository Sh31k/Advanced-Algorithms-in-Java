public class EuclideanAlgorithmFor2num {

	public static int gcd(int a, int b) {

		if (b == 0)
			return a;

		a %= b;

		return gcd(b, a);

	}

	public static void main(String[] args) {

		int a = 510, b = 3005;

		System.out.println("GCD: "+gcd(a, b));

	}

}
