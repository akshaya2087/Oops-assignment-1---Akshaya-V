
class InvalidWarrantyPeriodException extends Exception {
    public InvalidWarrantyPeriodException(String message) {
        super(message);
    }
}

class WarrantyValidator {
    private int periodMonths;

    public WarrantyValidator(int periodMonths) throws InvalidWarrantyPeriodException {
        if (periodMonths < 0) {
            throw new InvalidWarrantyPeriodException("Invalid Warranty Period: " + periodMonths + " months. Period cannot be negative.");
        }
        this.periodMonths = periodMonths;
    }

    public void processWarranty() {
        System.out.println("Warranty successfully set for " + periodMonths + " months.");
    }
}

public class ProgramC {
    public static void main(String[] args) {
        System.out.println("Student Name : Akshaya V");
        System.out.println("Register No  : 11302514804");
        System.out.println("----------------------------------");

        // Test with negative warranty period to demonstrate custom exception
        try {
            System.out.println("Attempting to assign a negative warranty period (-12 months)...");
            WarrantyValidator invalidWarranty = new WarrantyValidator(-12);
            invalidWarranty.processWarranty();
        } catch (InvalidWarrantyPeriodException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}