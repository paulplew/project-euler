public class Problem5 {
    //Smallest Multiple
    public static void main(String[]args) {
        int smallest = 1;
        while (!checkDivis(smallest)) {
            smallest++;
        }
        System.out.println(smallest);
    }

    public static boolean checkDivis(int a) {
        for (int i = 1; i < 21; i++) {
            if (a % i != 0) {
                return false;
            }
        }
        return true;
    }
}
