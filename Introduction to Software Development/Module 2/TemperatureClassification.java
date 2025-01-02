public class TemperatureClassification {
    public static void main(String[] args) {
        // set the temperature in Celsius
        int temperature = 25;
        
        // 1st level "if" condition
        if (temperature < 0) {
            System.out.println("Freezing.");
        } else {
            // 1st level "else" of 1st level "if"
            
            // 2nd level "if" condition
            if (temperature < 10) {
                System.out.println("Very Cold.");
            } else {
                // 2nd level "else" of 2nd level "if"
                
                // 3rd level "if" condition
                if (temperature < 20) {
                    System.out.println("Cool.");
                } else {
                    // 3rd level "else" of 3rd level "if"
                    
                    // 4th level "if" condition
                    if (temperature < 30) {
                        System.out.println("Warm.");
                    } else {
                        // 4th level "else" of 4th level "if"
                        System.out.println("Hot.");
                    }
                }
            }
        }
    }
}
