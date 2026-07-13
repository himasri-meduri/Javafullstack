import java.util.Scanner;
class Withoutfirstlast{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int last=s.length()-1;
        String mid=s.substring(1,last);
        System.out.println(mid);

    }
}