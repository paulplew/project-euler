public class Problem18 {
	public static void main(String args[]) {
		String[] tri = {
			"75",
			"95 64",
			"17 47 82",
			"18 35 87 10",
			"20 04 82 47 65",
			"19 01 23 75 03 34",
			"88 02 77 73 07 63 67",
			"99 65 04 28 06 16 70 92",
			"41 41 26 56 83 40 80 70 33",
			"41 48 72 33 47 32 37 16 94 29",
			"53 71 44 65 25 43 91 52 97 51 14",
			"70 11 33 28 77 73 17 78 39 68 17 57",
			"91 71 52 38 17 14 91 43 58 50 27 29 48",
			"63 66 04 68 89 53 67 30 73 16 69 87 40 31",
			"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"
		};

		//creates a new int to store the maximum sum path for all the rows
		int sum = 0;

		//calculates the number of rows using the tri array
		int rows = tri.length;

		//initializes a new 2d array that is a square with 0's in the places without an initial value
		int[][] square = new int[rows][rows];

		//fills the square array with values calculated in the triSet class
		for (int i = 0; i < rows; i++) {
			square[i] = triSet(tri[i], rows);
		}

		//calls max math to calculate the maximum path and returns the max number
		sum = maxPath(square);

		//prints the number "sum" which is the largest path sum
		System.out.println(sum);

	}


	//method to calculate the maximum value for the array by using the maximum cost path
	public static int maxPath(int[][] square) {
		//set up the int to return with the value
		int forReturn = 0;
		
		// //flips the array "square" top to bottom using the flip class
		// square = flip(square);

		//calls the recursive method step(int[][] a) and returns the value it calculates
		return step(square);
	}


	//method to recursively combine the array row by row
	public static int step(int[][] a) {

		//initializes an array to return and an array to store the new top row 
		int[][] forReturn = new int[a.length - 1][a[0].length];
 		int[] temp = new int[a[0].length];

 		//nested for loops to combine the top value of the array with the maximum sum from the row above
		for (int k = 0; k < a[0].length; k++) {
			if (a[a.length - 2][k] != 0) {
				//if the number below is greater than below to the right 
				if (a[a.length - 1][k] > a[a.length - 1][k+1]) {
					temp[k] = a[a.length - 1][k] + a[a.length - 2][k];
				}
				//if the number below and to the right is greater than directly below
				else {
					temp[k] = a[a.length - 1][k+1] + a[a.length - 2][k];
				}
			}
			else {
				temp[k] = 0;
			}
		}

		//sets the first row of forReturn to be the temp row
		for (int i = 0; i < forReturn[forReturn.length - 1].length; i++) {
			forReturn[forReturn.length - 1][i] = temp[i];
		}

		//for loops to set the remaining rows
		for (int i = 0; i < forReturn.length - 1; i++) {
			for (int k = 0; k < forReturn[0].length; k++) {
				forReturn[i][k] = a[i][k];
			}
		}

		//recursive call if the array has more than 1 rows it will call the method again
		if (a.length > 2) {
			return step(forReturn);
		}
		return forReturn[0][0];
	}


	//method to fill row with 0's if the row is not the total length
	public static int[] triSet(String a, int total) {

		//set up the array to be returned and the locator int
		int[] forReturn = new int[total];
		int k = 0;

		//begins forReturn with all the values in a
		for (int i = 0; i < a.length(); i += 3) {
			forReturn[k] = Integer.parseInt(a.substring(i, i + 2));
			k++;
		}

		//fills the rest of forReturn[] with 0 values
		for (int i = k; i < total; i++) {
			forReturn[i] = 0;
		}

		//returns the completed array forReturn
		return forReturn;
	}

}