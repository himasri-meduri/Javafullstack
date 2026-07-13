import java.util.Scanner;
class Firsthlaf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int mid=s.length()/2;
        String firsthalf=s.substring(0,mid);
        System.out.println(firsthalf);
        }
    }
