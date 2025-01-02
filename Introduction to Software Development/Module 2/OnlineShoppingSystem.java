import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Product information
        String productName = "Gaming Laptop";
        double price = 999.99;
        int stock = 5;
        
        System.out.println("Online Shopping System");
        
        // Loop for shopping cart
        for (int i = 0; i < 3; i++) {  // Allow 3 attempts
            System.out.println("\nAvailable actions:");
            System.out.println("1. Check price");
            System.out.println("2. Check stock");
            System.out.println("3. Compare products");
            System.out.println("4. Exit");
            
            String choice = scanner.nextLine().trim();
            
            if (choice.isEmpty()) {
                System.out.println("Please make a selection");
                continue;
            }
            
            switch (choice) {
                case "1":
                    if (price > 500) {
                        System.out.println("Premium product");
                        System.out.println("Price: $" + price);
                    } else if (price > 100) {
                        System.out.println("Standard product");
                        System.out.println("Price: $" + price);
                    } else {
                        System.out.println("Budget product");
                        System.out.println("Price: $" + price);
                    }
                    break;
                    
                case "2":
                    System.out.println("Enter required quantity:");
                    try {
                        int quantity = Integer.parseInt(scanner.nextLine());
                        if (quantity <= stock) {
                            System.out.println("Available!");
                        } else if (quantity > stock) {
                            System.out.println("Insufficient stock");
                        } else {
                            System.out.println("Invalid quantity");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number");
                    }
                    break;
                    
                case "3":
                    System.out.println("Enter product to compare:");
                    String compareProduct = scanner.nextLine();
                    if (compareProduct.startsWith("Gaming")) {
                        System.out.println("Similar product category");
                        if (productName.equalsIgnoreCase(compareProduct)) {
                            System.out.println("Exact same product!");
                        }
                    } else if (compareProduct.endsWith("Laptop")) {
                        System.out.println("Related product");
                        int comparison = productName.compareTo(compareProduct);
                        System.out.println("Comparison value: " + comparison);
                    }
                    break;
                    
                case "4":
                    System.out.println("Thank you for shopping!");
                    i = 3;  // Exit loop
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            }
        }
        scanner.close();
    }
}