
import java.lang.*;
import java.util.*;

public class Problem3 {

  public static void main(String[] args) {
        checkPrime(600851475143L);
  }

  public static long checkMult(ArrayList<Long> a) {
    int size = a.size();
    long product = 1;
    for (int i = 0; i < size; i++) {
      product *= a.get(i);
    }
    return product;
  }

  public static boolean checkPrime(long a) {
    ArrayList<Long> list = new ArrayList<>();
    long b = 2L;
    while (checkMult(list) < a) {
      if (a % b == 0) {
        System.out.println(b);
        list.add(b);
      }
      b++;
    }
    return true;
  }
}
