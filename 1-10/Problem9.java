import java.util.*;

public class Problem9 {
  //Special Pythagorean Triplet
    public static void main(String[]args) {
        for (int a = 3; a < 1000; a++) {
            for (int b = a+1; b < 1000; b++) {
               double cSq = (a*a) + (b*b);
               double c = Math.sqrt(cSq);
               if (a + b + c == 1000) {
                   System.out.println(a + " " + b + " " + c);
                   int prod = (int)(a * b * c);
                   System.out.println(prod);
                   break;
               }
            }
        }
    }
}
