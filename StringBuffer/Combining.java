import java.util.Scanner;

class Combining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings separated by a space:"); 
        String a = sc.next();
        String b = sc.next();        
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        System.out.println("The result:"); 
        
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
