public class Problem10 {
    public static void main(String[]args) {
        int num = 2000000;
        long sum = 0L;

        for (long i = 0L; i < num; i++) {
            if (prime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean prime(long a) {
        if (a < 2) {
            return false;
        }
        else if (a == 2) {
            return true;
        }
        for (int b = 2; b <= Math.sqrt(a); b++) {
            if (a % b == 0) {
                return false;
            }
        }
        return true;
    }
}
