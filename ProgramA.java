class Device {
    protected String brand;
    protected double price;

    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}

class SmartDevice extends Device {
    private String connectivityType;

    public SmartDevice(String brand, double price, String connectivityType) {
        super(brand, price);
        this.connectivityType = connectivityType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Connectivity Type: " + connectivityType);
    }
}

public class ProgramA {
    public static void main(String[] args) {
        System.out.println("Student Name : Akshaya V");
        System.out.println("Register No  : 11302514804");
        System.out.println("----------------------------------");

        SmartDevice smartPhone = new SmartDevice("Samsung", 899.99, "5G / Wi-Fi 6");
        smartPhone.displayDetails();
    }
}