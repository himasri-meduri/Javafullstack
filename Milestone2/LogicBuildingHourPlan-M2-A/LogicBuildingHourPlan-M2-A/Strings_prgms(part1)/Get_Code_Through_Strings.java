import java.util.Scanner;

public class Get_Code_Through_Strings {

    public static int getCodeThroughStrings(String input1) {

        String[] words = input1.split(" ");

        int totalLength = 0;

        // Calculate total length of all words
        for (String word : words) {
            totalLength += word.length();
        }

        // Reduce to single digit
        while (totalLength >= 10) {
            int sum = 0;

            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength /= 10;
            }

            totalLength = sum;
        }

        return totalLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String input = sc.nextLine();

        int result = getCodeThroughStrings(input);

        System.out.println("Output: " + result);

        sc.close();
    }
}