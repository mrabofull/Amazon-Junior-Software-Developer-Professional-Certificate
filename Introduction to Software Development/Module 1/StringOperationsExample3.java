public class StringOperationsExample3 {
    public static void main(String args[]) {
        String firstName = "John";
        String lastName = "Smith";
        String email = "john.smith@yahoo.com";
        
        // Concatenation and case conversion
        String username = firstName.concat(lastName).toLowerCase();
        System.out.println("Username: " + username);
        
        // Email domain replacement
        String updatedEmail = email.replace("yahoo.com", "outlook.com");
        System.out.println("Updated email: " + updatedEmail);
        
        // Finding special characters
        System.out.println("@ position: " + email.indexOf('@'));
        System.out.println(". position: " + email.indexOf('.'));
    }
}