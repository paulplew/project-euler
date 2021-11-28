public class Problem19 {


	public static void main(String[] args) {
		// place in the start and end years
		int start = 1901;
		int end = 2000;

		//input the weekday the first of jan falls on 
		//0 = sun, 1 = mon, 2 = tues, 3 = wed, 4 = thurs, 5 = fri, 6 = sat
		int day = 2;
		
		int numSunday = 0;  

		while (start <= end) {

			int month = 1;

			while (month <= 12) {

				//calls the numDays(int month, int year) class to calculate how many days in a given month on a given year
				day += (numDays(month, start) % 7);

				//if the day is more than 7 it wraps to the next week
				if (day >= 7) {
					day = day % 7;
				}

				//if the day is a sunday (on the first of the month) adds a new sunday
				if (day == 0) {
					numSunday ++;
				}

				//increments month
				month++;

			}

			//increments year
			start ++;

		}
		//prints out the number of sundays calculated over the interval
		System.out.println(numSunday);
	}


	public static int numDays(int month, int year) {
		//if the month is Jan, Mar, May, Jul, Aug, Oct, or Dec return 31
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		//if the month is Apr, Jun, Sep, or Nov return 30
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		//if the month is Feb
		else {
			//if the years is divisible by 4 but not a century or the century is divisible by 400 retrurn 29 (leap)
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				return 29;
			}
			//if the above returns false return 28 (non-leap)
			else 
				return 28;
		}
	}

}