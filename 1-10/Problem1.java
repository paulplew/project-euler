import java.util.*;
//Multiples of 5 and 3
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To what number do you want to check?");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++){
            sum += check(i);
        }
        System.out.println(sum);
    }

    public static int check(int k) {
    if (k % 3 == 0) {
        return k;
    }
    else if (k % 5 == 0) {
        return k;
    }
    else return 0;

    }
}
