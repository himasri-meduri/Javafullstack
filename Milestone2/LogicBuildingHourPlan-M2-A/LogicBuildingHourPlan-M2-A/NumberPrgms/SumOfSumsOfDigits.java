import java.util.Scanner;

public class SumOfSumsOfDigits {

    public static int sumOfSumsOfDigits(int input1) {
        String s = String.valueOf(input1);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int input1 = sc.nextInt();

        int result = sumOfSumsOfDigits(input1);

        System.out.println("Answer = " + result);

        sc.close();
    }
}