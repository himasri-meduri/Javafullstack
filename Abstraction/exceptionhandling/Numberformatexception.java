import java.util.Scanner;
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}
public class Numberformatexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 2;
        int totalSubjects = 3;
        for (int i = 1; i <= totalStudents; i++) {
            System.out.println("\n--- Entering details for Student " + i + " ---");
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            int sum = 0;
            int subjectCount = 1;
            while (subjectCount <= totalSubjects) {
                System.out.print("Enter marks for Subject " + subjectCount + ": ");
                String input = scanner.nextLine();
                try {
                    int marks = Integer.parseInt(input);
                    if (marks < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (marks > 100) {
                        throw new OutOfRangeException("Marks must be between 0 and 100.");
                    }
                    sum += marks;
                    subjectCount++; 
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid format! Please enter an integer value.");
                } catch (NegativeValueException | OutOfRangeException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            double average = (double) sum / totalSubjects;
            System.out.printf("Average marks of %s: %.2f\n", name, average);
        }
        scanner.close();
    }
}
