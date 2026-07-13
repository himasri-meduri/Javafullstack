import java.util.Scanner;
class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string and number (e.g., Wipro,3):");
        String input = sc.next(); 
        String[] parts = input.split(",");
        String word = parts[0];             
        int n = Integer.parseInt(parts[1]);   
        String lastNChars = word.substring(word.length() - n); 
        String result = lastNChars.repeat(n); 
        System.out.println(result);
        sc.close();
    }
}
