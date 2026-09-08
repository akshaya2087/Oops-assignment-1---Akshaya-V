
abstract class Warranty {
    protected int warrantyPeriodMonths;

    public Warranty(int warrantyPeriodMonths) {
        this.warrantyPeriodMonths = warrantyPeriodMonths;
    }

    public abstract void claimWarranty();
}

class ExtendedWarranty extends Warranty {
    private double extensionCost;

    public ExtendedWarranty(int warrantyPeriodMonths, double extensionCost) {
        super(warrantyPeriodMonths);
        this.extensionCost = extensionCost;
    }

    @Override
    public void claimWarranty() {
        System.out.println("Claiming extended warranty coverage for " + warrantyPeriodMonths + " months.");
        System.out.println("Additional warranty cost: $" + extensionCost);
    }
}

public class ProgramB {
    public static void main(String[] args) {
        System.out.println("Student Name : Akshaya V");
        System.out.println("Register No  : 11302514804");
        System.out.println("----------------------------------");

        Warranty myWarranty = new ExtendedWarranty(24, 49.99);
        myWarranty.claimWarranty();
    }
}