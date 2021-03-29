public class Problem2 {
    //Even Fibonacci numbers
    public static void main(String[]args) {
        int n = 0;
        int sum = 0;
        while (fib(n) < 4000000) {
            if (fib(n) % 2 == 0) {
                sum += fib(n);
            }
            n++;
        }
        System.out.println(sum);
    }

    public static int fib(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else return fib(n-1) + fib(n-2);
    }
}
