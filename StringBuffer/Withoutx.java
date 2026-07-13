import java.util.Scanner;
class Withoutx{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int first=s.charAt(0);
        int last=s.charAt(s.length()-1);
        if(first=='x'|| last=='x'){
            System.out.println(s.replace("x",""));
        }else{
            System.out.println(s);
        }
    }
}