import java.util.Scanner;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    // Method to read smartphone details
    public void readModelDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        model = scanner.nextLine();

        System.out.print("Enter Storage Capacity (in GB): ");
        storageCapacity = scanner.nextInt();
    }

    // Method to display smartphone details
    public void displayDetails() {
        System.out.println("\nSmartphone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
    }

    // Main method
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
   
        phone.readModelDetails();
        phone.displayDetails();
    }
}