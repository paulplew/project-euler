public class Problem6 {
    //Sum Square Difference
    public static void main(String[]args) {
        int maxNum = 100;

        int square = 0;
        int squareSum = 0;
        for (int i = 0; i <= maxNum; i++) {
            square += (i*i);
            squareSum += i;
        }
        squareSum *= squareSum;
        int difference = squareSum - square;

        System.out.println(difference);
    }
}
