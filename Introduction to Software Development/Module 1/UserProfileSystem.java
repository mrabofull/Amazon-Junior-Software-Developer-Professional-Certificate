public class UserProfileSystem {
    public static void main(String[] args) {
        // Social media username validation and formatting
        String fullName = "   Sarah Jane Parker   ";
        String username = "@SarahJParker123";
        String bioText = "Professional photographer | Nature lover | Travel enthusiast";
        
        // Clean up inputs
        fullName = fullName.trim();
        username = username.trim();
        
        // Username validation
        System.out.println("Starts with @: " + username.startsWith("@"));
        System.out.println("Username length valid: " + !username.substring(1).isEmpty());
        
        // Compare with existing username in system
        String existingUsername = "@sarahjparker123";
        System.out.println("Username available: " + !username.equalsIgnoreCase(existingUsername));
        
        // Find and validate hashtags in bio
        int hashtagIndex = bioText.indexOf("#");
        if (hashtagIndex != -1) {
            String firstHashtag = bioText.substring(hashtagIndex);
            System.out.println("First hashtag: " + firstHashtag);
        }
        
        // Format display name
        String displayName = fullName.toUpperCase();
        System.out.println("Display name: " + displayName);
        
        // Create URL-friendly username version
        String urlUsername = username.substring(1).toLowerCase();
        System.out.println("URL username: " + urlUsername);
        
        // Compare profile sections for moderation
        String[] sections = bioText.split("\\|");
        for (String section : sections) {
            System.out.println("Section: " + section.trim());
        }
    }
}