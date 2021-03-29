import java.util.*;
import java.lang.*;

public class Problem4 {
    //Largest Palindrome Product
    public static void main(String[]args) {
        int max = -1;
        for (int i = 100; i < 1000; i++) {
            for (int k = 100; k < 1000; k++) {
                Integer product = i*k;
                String send = Integer.toString(product);
                //System.out.println(send);
                if (palin(send)) {
                    if (Integer.parseInt(send) > max) {
                        max = Integer.parseInt(send);
                    }
                    //System.out.println("i = "+i+ " k = "+k+" Product = "+product);
                }
            }
        }
        System.out.println(max);
    }

    public static boolean palin(String a) {
        if (a.length() == 0 || a.length() == 1) {
            return true;
        }
        //System.out.println(a.substring(0,1)+a.substring(a.length()));
        if (a.substring(0,1).equals(a.substring(a.length()-1))) {
            return palin(a.substring(1,a.length()-1));
        }

        return false;
    }
}

