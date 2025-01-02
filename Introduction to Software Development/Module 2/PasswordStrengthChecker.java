public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        int length = password.length();
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");
        
        // Sequential checks for password strength
        if (length < 8) {
            System.out.println("Too Short - Weak Password");
        } else {
            if (!hasUpperCase) {
                System.out.println("No Uppercase - Weak Password");
            } else {
                if (!hasNumber) {
                    System.out.println("No Numbers - Medium Password");
                } else {
                    if (!hasSpecialChar) {
                        System.out.println("No Special Characters - Medium Password");
                    } else {
                        if (length < 12) {
                            System.out.println("Good Password");
                        } else {
                            System.out.println("Strong Password");
                        }
                    }
                }
            }
        }
        
        scanner.close();
    }
}