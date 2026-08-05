import java.util.Scanner;

public class SumOfPowerOfDigits {

    public static int sumOfPowerOfDigits(int input1) {

        String s = String.valueOf(input1);
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int digit = s.charAt(i) - '0';
            int power = s.charAt(i + 1) - '0';

            sum += (int)Math.pow(digit, power);
        }

        int lastDigit = s.charAt(s.length() - 1) - '0';
        sum += (int)Math.pow(lastDigit, 0);

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int input1 = sc.nextInt();

        System.out.println(sumOfPowerOfDigits(input1));

        sc.close();
    }
}