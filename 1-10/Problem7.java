public class Problem7 {
    //10001st Prime
    public static void main(String[] args) {
        int n = 10001;
        System.out.println(getPrime(n));
    }

    public static int getPrime(int n) {
        int number = 0;
        for (int numOfPrime = 0; numOfPrime <= n; numOfPrime++) {
            int newNum = number + 1;
            while (Prime(newNum)) {
                newNum++;
            }
            number = newNum;
        }
        return number;
    }

    public static boolean Prime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
