import java.math.*;
public class Problem15 {
	public static void main(String[]args) {
		System.out.println(choose(40,20));

	}
	public static BigInteger choose(int top, int bottom) {
		return factorialSimplifier(top, bottom).divide(factorial(top - bottom));
	}
	// Same as top!/bottom! but simplified
	public static BigInteger factorialSimplifier(int top, int bottom) {
		// System.out.println(top + " " + bottom);
		BigInteger forReturn = new BigInteger("1");
		for (int i = top; i > bottom; i--) {
			forReturn = forReturn.multiply(new BigInteger(""+i));
		}
		return forReturn;
	}

	public static BigInteger factorial(int a) {
		BigInteger forReturn = new BigInteger(""+1);

		while (a > 0) {
			forReturn = forReturn.multiply(new BigInteger(""+a));
			a--;
		}
		return forReturn;
	}
}