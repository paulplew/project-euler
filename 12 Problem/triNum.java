public class triNum{
	private int num;
	private int triangle;

	public triNum() {
		num = 1;
		triangle = 1;
	}

	public void getDivs(int n) {
		int max = Integer.MIN_VALUE, divs = 0, biggestDivTriangle = 0;

		while (divs < n) {
			increment();
			divs = getNumDivisors(triangle);
			System.out.println("Biggest Triangle: " + biggestDivTriangle + "\nMax Divs: " + max + "\nDivs: " + divs + "\nNum:" + num + "\n");

			if (divs > max) {
				biggestDivTriangle = triangle; 
				max = divs;
			}
			//System.out.println(triangle);
		}
	}

	public void increment() {
		num++;
		triangle += num;
	}

	public int getTriangle() {
		return triangle;
	}

	public int getNumDivisors(int a) { //finds the number of divisors
		int toCheck = 1;
		int num = 1;
		while (toCheck <= (a/2)) {
			if (a % toCheck == 0) {
				num++;
			}
			toCheck++;
		}
		return num;
	}

}