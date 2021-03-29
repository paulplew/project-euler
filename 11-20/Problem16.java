import java.math.BigInteger;

public class Problem16 {
	public static void main(String[]args) {
		BigInteger a = pow(2,1000);
		System.out.println(getSumDigits(a)); 
	}

	public static BigInteger pow(int base, int power) {
		BigInteger send = new BigInteger("" + 1);
		for (int i = 0; i < power; i++) {
			send = send.multiply(new BigInteger("" + base));
		}
		return send;
	}

	public static BigInteger getSumDigits(BigInteger a) {
		BigInteger forReturn = new BigInteger("1");
		BigInteger compare = new BigInteger("1");
		while (a.compareTo(compare) != 0) {
			forReturn = forReturn.add(a.divideAndRemainder(new BigInteger("10"))[1]);
			a = a.divide(new BigInteger("10"));
			// System.out.println(a);
		}
		return forReturn;
	}
}