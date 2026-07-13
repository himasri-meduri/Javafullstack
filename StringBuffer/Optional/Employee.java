import java.util.Optional;
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
class Employee {
    public static void main(String args[]) {
        String employee = null;
        Optional<String> n = Optional.ofNullable(employee);
        try {
            String result = n.orElseThrow(() -> new InvalidEmployeeException("Invalid Employee Data"));
            System.out.println("Employee: " + result);
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
