
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {


    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. Provided: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 0, 5};
        int age = 16; 

        try {
            System.out.println("Division example:");
            int result = numbers[0] / numbers[1];
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes (cleanup or logging).");
        }

        System.out.println("\n--- Custom Exception Example ---");

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation complete.");
        }

        System.out.println("\n--- Multiple Catch Blocks Example ---");


        try {
            int division = numbers[0] / numbers[2];
            System.out.println("Division Result: " + division);
            System.out.println(numbers[5]); 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Multiple catch blocks executed.");
        }
    }
}
