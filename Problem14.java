public class Problem14 {
  public static void main(String[] args) {
    int max = Integer.MIN_VALUE, temp = 0;
    long biggest = 0l, limit = 1000000l;
    for (Long i = 0l; i <= limit; i++) {
      temp = collatz(i);
      if (temp > max) {
        max = temp;
        biggest = i;
      }
    }
    System.out.println(biggest);
  }

  public static int collatz(long n) {
    // System.out.println(n);
    if (n <= 1) {
      return 1;
    } else if (n % 2 == 0) {
      return 1 + collatz(n / 2);
    } else {
      return 1 + collatz((3 * n) + 1);
    }

  }
}