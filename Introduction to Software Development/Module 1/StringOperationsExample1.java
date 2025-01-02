public class StringOperationsExample1 {
    public static void main(String args[]) {
        String text = "Butterfly";
        
        // Basic operations
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 2: " + text.charAt(2));
        System.out.println("Substring (1,5): " + text.substring(1, 5));
        
        // Case operations
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        
        // Search operations
        System.out.println("Contains 'fly': " + text.contains("fly"));
        System.out.println("Starts with 'Butter': " + text.startsWith("Butter"));
        System.out.println("Ends with 'fly': " + text.endsWith("fly"));
        
        // Replace operations
        System.out.println("Replace 't' with 'd': " + text.replace('t', 'd'));
        System.out.println("Replace 'fly' with 'milk': " + text.replace("fly", "milk"));
        
        // Additional useful methods
        System.out.println("First index of 't': " + text.indexOf('t'));
        System.out.println("Last index of 't': " + text.lastIndexOf('t'));
        System.out.println("Is string empty? " + text.isEmpty());
    }
}