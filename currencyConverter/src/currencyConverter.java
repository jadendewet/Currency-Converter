// Imports libraries
import java.text.DecimalFormat;
import java.util.Scanner;

// Main method
public class currencyConverter {
    public static void main(String[] args) {

        // Creates objects of the decimal format class, creates a scanner and control variable
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        boolean menuControl = true;

        // While true - continues to run until the user wants to exit
        while (menuControl) {

            // Prints the options for the user
            System.out.println("Please enter the number related to your conversion: \n");
            String menu = "1.) ZAR to EURO\n";
            menu += "2.) EURO to ZAR\n";
            menu += "3.) GDP to ZAR\n";
            menu += "4.) ZAR to GDP\n";
            menu += "5.) USD to ZAR\n";
            menu += "6.) ZAR to USD\n";
            menu += "7.) YEN to ZAR\n";
            menu += "8.) ZAR to YEN\n";
            menu += "9.) Exit\n";

            double conversion;
            System.out.println(menu);
            int userMenuChoice = input.nextInt();

            // Creates if and else statements based on user input and executes the related action
            if (userMenuChoice == 1) {
                System.out.println("Please enter the value in ZAR: ");
                double zarInput = input.nextDouble();
                double zarToEuro = 0.060;
                conversion = Double.parseDouble(df.format(zarInput * zarToEuro));
                System.out.println("R" + zarInput + " equates to: €" + conversion);

            } else if (userMenuChoice == 2) {
                System.out.println("Please enter the value in EUROs: ");
                double euroInput = input.nextDouble();
                double euroToZar = 16.78;
                conversion = Double.parseDouble(df.format(euroInput * euroToZar));
                System.out.println("€" + euroInput + " equates to: R" + conversion + "\n");

            } else if (userMenuChoice == 3) {
                System.out.println("Please enter the value in GDP: ");
                double gdpInput = input.nextDouble();
                double gdpToZar = 19.85;
                conversion = Double.parseDouble(df.format(gdpInput * gdpToZar));
                System.out.println("£" + gdpInput + " equates to: R" + conversion + "\n");

            } else if (userMenuChoice == 4) {
                System.out.println("Please enter the value in ZAR: ");
                double zarInput = input.nextDouble();
                double zarToGdp = 0.050;
                conversion = Double.parseDouble(df.format(zarInput * zarToGdp));
                System.out.println("R" + zarInput + " equates to: £" + conversion + "\n");

            } else if (userMenuChoice == 5) {
                System.out.println("Please enter the value in USD: ");
                double usdInput = input.nextDouble();
                double usdToZar = 16.25;
                conversion = Double.parseDouble(df.format(usdInput * usdToZar));
                System.out.println("$" + usdInput + " equates to: R" + conversion + "\n");

            } else if (userMenuChoice == 6) {
                System.out.println("Please enter the value in ZAR: ");
                double zarInput = input.nextDouble();
                double zarToUsd = 0.062;
                conversion = Double.parseDouble(df.format(zarInput * zarToUsd));
                System.out.println("R" + zarInput + " equates to: $" + conversion + "\n");

            } else if (userMenuChoice == 7) {
                System.out.println("Please enter the value in YEN: ");
                double yenInput = input.nextDouble();
                double yenToZar = 0.12;
                conversion = Double.parseDouble(df.format(yenInput * yenToZar));
                System.out.println("¥" + yenInput + " equates to: R" + conversion + "\n");

            } else if (userMenuChoice == 8) {
                System.out.println("Please enter the value in ZAR: ");
                double zarInput = input.nextDouble();
                double zarToYen = 8.17;
                conversion = Double.parseDouble(df.format(zarInput * zarToYen));
                System.out.println("R" + zarInput + " equates to: ¥" + conversion + "\n");

                // Ends the loop if selected
            } else if (userMenuChoice == 9) {
                System.out.println("Thank you for using the program! - Goodbye");
                menuControl = false;
            }

            // Else informs the user they have entered an invalid option
            else {
                System.out.println("You have entered an invalid option - please try again");
            }


        }
    }
}