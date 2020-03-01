package chapter1.operators;

public class OperatorsSample {

	public static void compareAndEqualityOperators() {

		int a = 10;
		int b = 20;

		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("b >= a = " + (b >= a));
		System.out.println("b <= a = " + (b <= a));
	}

	public static void bitwiseOperators() {

		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;

		c = a >>> 2;

		System.out.println(c);
	}
	
	public static void logicalOperators() {
		boolean a = true;
		boolean b = false;
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!(a && b) = " + !(a && b));
	}

	public static void arithmeticOperators() {

		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;

		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("b / a = " + (b / a));
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));
		System.out.println("a++   = " + (a++));
		System.out.println("b--   = " + (a--));

		System.out.println("d++   = " + (d++));
		System.out.println("++d   = " + (++d));

		System.out.println(++d);
		System.out.println(c++);
		System.out.println(c);

		int result = (5 + 6) * 5;
		System.out.println("Sonuc1: " + result);

		result = 5 + 6 * 5;
		System.out.println("Sonuc2: " + result);

		// unsigned values
		int uSignedInt = Integer.parseUnsignedInt("100");
		System.out.println(uSignedInt);
		// Long.parseUnsignedLong(s);
	}

	public static void main(String[] args) {

		// arithmeticOperators();
		// logicalOperators();
		// bitwiseOperators();
		logicalOperators();
		
		// Nesne tipini String olarak döndürür.
		// String.class.getCanonicalName();
	}

}
