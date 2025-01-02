public class StringOperationsExample2 {
    public static void main(String args[]) {
        String text = "  Hello World  ";
        
        // Trim and length
        System.out.println("Original length: " + text.length());
        String trimmed = text.trim();
        System.out.println("Trimmed length: " + trimmed.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        
        // Split operation
        String sentence = "Java,Python,C++,JavaScript";
        String[] languages = sentence.split(",");
        System.out.println("Programming languages:");
        for (String language : languages) {
            System.out.println(language);
        }
        
        // Join operation (Java 8+)
        String joined = String.join(" - ", languages);
        System.out.println("Joined string: " + joined);
        
        // Character checking
        String number = "12345";
        System.out.println("Is digit? " + number.chars().allMatch(Character::isDigit));
        
        // Format string
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println(formatted);
    }
}