import java.security.spec.RSAOtherPrimeInfo;

import java.util.Scanner;
public class HMICalc {
    public static void main(String[] args){
        //Make Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for weight in lbs
        System.out.print("Enter weight in lbs: ");
        double weightLbs = input.nextDouble();

        // Prompt the user for height in ft
        System.out.print("Enter height in ft: ");
        double heightFt = input.nextDouble();

        // Convert weight to kg
        double weightKg = weightLbs * 0.453;

        // Convert height to m
        double heightM = heightFt * 0.305;

        // Calculate Health Metrics Index (HMI)
        double hmi = weightKg / Math.pow(heightM, 2); //
        //(heightM*heightM);


        // Round HMI to a whole number
        //int roundedHMI = (int) Math.round(hmi);

        // Display the calculated HMI
        System.out.println("User has a HMI of " + hmi);

        // Make decisions based on HMI
        if (hmi <= 18.5) {
            System.out.println("HMI of " + hmi + " needs calorie increase");

            // and operator = &&
            // or operator = ||
            // Not operator !=
        } else if (hmi > 18.5 && hmi <= 25) {
            System.out.println("HMI of " + hmi + " should maintain current calorie intake");

        } else if (hmi > 25 && hmi < 30) {
            System.out.println("HMI of " + hmi + " should reduce calorie intake");

        } else {
            System.out.println("HMI of " + hmi + " needs calorie deficit");
        }
    }
}
