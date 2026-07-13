import java.util.Scanner;
class Star { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        String before = "";
        String after = "";
        int starIndex = s.indexOf("*");
        
        if (starIndex != -1) {
            if (starIndex > 1) {
                before = s.substring(0, starIndex - 1);
            }
            if (starIndex + 2 < s.length()) {
                after = s.substring(starIndex + 2);
            }
            String result = before + after;
            System.out.println(result);
        } else {
            System.out.println(s);
        }
        
        sc.close();
    }
}
