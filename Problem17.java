public class Problem17 {
	public static void main(String[]args) {
		int total = 0;
		for (int i = 1; i <= 1000; i++) {
			total += (getString(i)).length();
		}
		System.out.println(total);
	}

	public static String getString(int a) {
		if (Integer.toString(a).length() > 4) {
			return "N/A";
		}
		String[] singleDigits = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tenMults = {"","", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String[] prefixes = {"hundred", "thousand"};

		String nums = Integer.toString(a);
		String forReturn = "";
		if (nums.length() == 4) { //Solves for the thousands place in the string
			forReturn += singleDigits[Integer.parseInt(nums.substring(0,1))];
			forReturn += prefixes[1];
			nums = nums.substring(1, nums.length());
		}
		
		// System.out.println(nums);

		if (nums.length() == 3) { //Solves for the hundreds place in the string
			String hundreds = singleDigits[Integer.parseInt(nums.substring(0,1))];
			forReturn += singleDigits[Integer.parseInt(nums.substring(0,1))];
			if (!hundreds.equals("")) {
				forReturn += prefixes[0];
			}
			if (!nums.substring(nums.length() - 2, nums.length()).equals("00")) {
				forReturn += "and";
			}
			nums = nums.substring(1, nums.length());
		}

		// System.out.println(nums);

		if (nums.length() == 2) {
			if (nums.substring(nums.length() - 2, nums.length() - 1).equals("1")) { //solves for the teens String
				forReturn += teens[Integer.parseInt(nums.substring(nums.length() - 1, nums.length()))];
				nums = nums.substring(1, nums.length());
				return forReturn;
			}
			else if (!nums.substring(nums.length() - 2, nums.length() - 1).equals("0")) { //solves for the tens if not a teen place on the string
				forReturn += tenMults[Integer.parseInt(nums.substring(nums.length() - 2, nums.length() - 1))];
				nums = nums.substring(1, nums.length());
			}
			else { 
				nums = nums.substring(1, nums.length());
			}
		}

		// System.out.println(nums);

		if (nums.length() == 1) { //solves for the ones place in the stringg
			forReturn += singleDigits[Integer.parseInt(nums.substring(nums.length() - 1, nums.length()))];
		}

		return forReturn;
	}
}