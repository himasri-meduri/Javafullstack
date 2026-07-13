import java.util.Scanner;
class Nullorelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the address");
        String address = sc.nextLine();
        if (address != null && !address.trim().isEmpty() && !address.equalsIgnoreCase("null")) {
            System.out.println(address);
        } else {
            System.out.println("India");
        }
        
        sc.close();
    }
}
