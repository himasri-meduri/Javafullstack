import java.util.*;

public class FindStringCode {

    public static int findStringCode(String input1) {

        String[] words = input1.toUpperCase().split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            int sum = 0;

            int i = 0;
            int j = word.length() - 1;

            while (i <= j) {

                int first = word.charAt(i) - 'A' + 1;
                int last = word.charAt(j) - 'A' + 1;

                sum += Math.abs(first - last);

                i++;
                j--;
            }

            result.append(sum);
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String input = sc.nextLine();

        int result = findStringCode(input);

        System.out.println("Output: " + result);

        sc.close();
    }
}