class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super();
    }
    public InvalidCountryException(String message) {
        super(message);
    }
}
public class UserRegistration {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        // Use equalsIgnoreCase to handle variations like "india" or "INDIA" smoothly
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        System.out.println("--- Testing Example 1 ---");
        try {
            registration.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("\n--- Testing Example 2 ---");
        try {
            registration.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
