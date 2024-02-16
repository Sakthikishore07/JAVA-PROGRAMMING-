import java.util.Scanner;

class LastTwoDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int ld = year % 100;
        System.out.println("The last two digits of the year: " + ld);
    }
}
