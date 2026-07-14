import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Nameandage {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Error: Missing arguments!");
            System.out.println("Usage: java Nameandage.java [Name] [Age]");
            return;
        }
        try {
            String name = args[0]; 
            int age;
            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new InvalidAgeException("Error: Age must be a valid numeric integer.");
            }
            if (age >= 18 && age < 60) {
                System.out.println("Valid user: " + name);
            } else {
                throw new InvalidAgeException("Error: Age must be >= 18 and < 60. Provided: " + age);
            }

        } catch (InvalidAgeException e){ 
                    System.out.println(e.getMessage());
        }
    }
}

