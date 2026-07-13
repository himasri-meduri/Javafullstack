import java.util.Scanner;
class Concatenate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.next();
        String s2=sc.next();
        char lastchar = s1.charAt(s1.length() - 1);
        char firstchar = s2.charAt(0);
        if(lastchar!=firstchar){
        String result=s1+s2;
        String output=result.toLowerCase();
        System.out.println(output);
        }
        else{
            String result = s1 + s2.substring(1); 
            String output = result.toLowerCase();
            System.out.println(output);
        }
    }
}