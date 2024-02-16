import java.util.Scanner;

public class SumOfN {
    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + sumOfN(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfN(n);
        System.out.println("Sum of first " + n + " numbers: " + sum);
    }
}
