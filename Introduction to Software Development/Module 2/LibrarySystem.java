import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial book information
        String bookTitle = " The Great Gatsby ";
        String userInput = "";
        int bookCount = 3;
        
        // Basic string operations
        bookTitle = bookTitle.trim();
        System.out.println("Welcome to Library Management System");
        
        // Loop for menu
        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.println("\n1. Check book availability");
            System.out.println("2. Compare book titles");
            System.out.println("3. Search book");
            System.out.println("4. Exit");
            
            userInput = scanner.nextLine();
            
            switch (userInput) {
                case "1":
                    if (bookCount > 0) {
                        System.out.println("Books are available");
                    } else if (bookCount == 0) {
                        System.out.println("Out of stock");
                    } else {
                        System.out.println("Invalid count");
                    }
                    break;
                    
                case "2":
                    System.out.println("Enter book title to compare:");
                    String compareTitle = scanner.nextLine();
                    if (bookTitle.equalsIgnoreCase(compareTitle)) {
                        System.out.println("Same book found!");
                    } else {
                        System.out.println("Different book");
                    }
                    break;
                    
                case "3":
                    System.out.println("Enter search term:");
                    String searchTerm = scanner.nextLine();
                    if (!searchTerm.isEmpty()) {
                        if (bookTitle.toLowerCase().startsWith(searchTerm.toLowerCase())) {
                            System.out.println("Book found starting with: " + searchTerm);
                        } else if (bookTitle.toLowerCase().contains(searchTerm.toLowerCase())) {
                            System.out.println("Book contains: " + searchTerm);
                            int index = bookTitle.toLowerCase().indexOf(searchTerm.toLowerCase());
                            System.out.println("Found at position: " + index);
                        } else {
                            System.out.println("No matches found");
                        }
                    }
                    break;
                    
                case "4":
                case "exit":
                    userInput = "exit";
                    break;
                    
                default:
                    System.out.println("Invalid option");
            }
        }
        scanner.close();
    }
}