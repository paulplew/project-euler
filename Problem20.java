import java.math.*;

public class Problem20 {
	public static void main(String[] args) {
		BigInteger fact = factorial(100);
		BigInteger sum = new BigInteger(""+0);

		while (fact.compareTo(BigInteger.ZERO) != 0) {
			
			sum = sum.add(fact.remainder(BigInteger.TEN));

			fact = fact.divide(BigInteger.TEN);
			
			// System.out.println(fact.remainder(BigInteger.TEN));
			// System.out.println(fact);
			// System.out.println(sum);
		
		}

		System.out.println(sum);
	
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