import java.util.Scanner;
class Return {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        if(s.length()>=2){
        String output = s.substring(0, 2);
            System.out.println(output);
        } else {
            System.out.println(s);
        }
    }
}
