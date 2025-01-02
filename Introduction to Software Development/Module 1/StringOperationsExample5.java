public class StringOperationsExample5 {
    public static void main(String args[]) {
        String companyName = "Tech";
        String domain = "startup";
        String website = "www.techstartup.io";
        
        // Creating business email format
        String emailFormat = companyName.toLowerCase() + "-" + domain.toLowerCase();
        System.out.println("Business identifier: " + emailFormat);
        
        // Domain manipulation
        String newWebsite = website.replace("www.", "app.");
        newWebsite = newWebsite.replace(".io", ".com");
        System.out.println("New website: " + newWebsite);
        
        // Finding domain parts
        int dotPosition = website.indexOf('.');
        int lastDotPosition = website.lastIndexOf('.');
        String domainPart = website.substring(dotPosition + 1, lastDotPosition);
        System.out.println("Domain part: " + domainPart);
    }
}