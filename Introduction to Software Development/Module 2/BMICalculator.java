public class BMICalculator {
    public static void main(String[] args) {
        // set the BMI value
        double bmi = 23.5;
        
        // 1st level "if" condition
        if (bmi < 16) {
            System.out.println("Severe Underweight.");
        } else {
            // 1st level "else" of 1st level "if"
            
            // 2nd level "if" condition
            if (bmi < 18.5) {
                System.out.println("Underweight.");
            } else {
                // 2nd level "else" of 2nd level "if"
                
                // 3rd level "if" condition
                if (bmi < 25) {
                    System.out.println("Normal Weight.");
                } else {
                    // 3rd level "else" of 3rd level "if"
                    
                    // 4th level "if" condition
                    if (bmi < 30) {
                        System.out.println("Overweight.");
                    } else {
                        // 4th level "else" of 4th level "if"
                        System.out.println("Obese.");
                    }
                }
            }
        }
    }
}
