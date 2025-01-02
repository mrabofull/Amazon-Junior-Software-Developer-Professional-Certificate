public class EmailValidator {
    public static void main(String[] args) {
        // Email validation and formatting system
        String email1 = "  John.Doe@COMPANY.COM  ";
        String email2 = "  john.doe@company.com  ";
        String domainToCheck = "company.com";
        
        // Clean up emails by trimming whitespace
        email1 = email1.trim();
        email2 = email2.trim();
        
        // Compare emails (case-sensitive and insensitive)
        System.out.println("Exact match: " + email1.compareTo(email2));
        System.out.println("Emails match ignoring case: " + email1.equalsIgnoreCase(email2));
        
        // Domain validation
        System.out.println("Has valid domain: " + email1.toLowerCase().endsWith(domainToCheck));
        System.out.println("Is corporate email: " + email1.toLowerCase().startsWith("john"));
        
        // Find username and domain parts
        int atSymbolIndex = email1.indexOf("@");
        String username = email1.substring(0, atSymbolIndex);
        
        // Check for empty parts
        String domainPart = email1.substring(atSymbolIndex + 1);
        System.out.println("Username is empty: " + username.isEmpty());
        System.out.println("Domain is empty: " + domainPart.isEmpty());
        
        // Standardize format
        System.out.println("Standardized email: " + email1.toLowerCase());
        System.out.println("Username in caps: " + username.toUpperCase());
    }
}