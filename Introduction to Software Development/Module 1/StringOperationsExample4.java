public class StringOperationsExample4 {
    public static void main(String args[]) {
        String artistFirst = "Taylor";
        String artistLast = "Swift";
        String socialMedia = "@taylor_swift_music";
        
        // Different ways of concatenation
        String fullName = artistFirst + " " + artistLast;
        String handle = (artistFirst + artistLast + "Official").toLowerCase();
        
        System.out.println("Artist name: " + fullName);
        System.out.println("Social handle: " + handle);
        
        // Multiple replacements
        String updatedSocial = socialMedia.replace("_", "").replace("@", "");
        System.out.println("Clean handle: " + updatedSocial);
        
        // Finding multiple occurrences
        System.out.println("First _ at: " + socialMedia.indexOf('_'));
        System.out.println("Last _ at: " + socialMedia.lastIndexOf('_'));
    }
}