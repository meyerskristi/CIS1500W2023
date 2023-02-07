import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the length of the deck in meters");
        double lengthOfDeckInMeters = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the width of the deck in meters");
        double widthOfDeckInMeters = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the length of the board in meters");
        double lengthOfBoardInMeters = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the width of the board in meters");
        double widthOfBoardInMeters = Double.parseDouble(keyboard.nextLine());

        double numberOfBoardsRequired = Math.ceil(
                ( lengthOfDeckInMeters * widthOfDeckInMeters ) /
                ( lengthOfBoardInMeters * widthOfBoardInMeters ) );

        System.out.println("Enter price of a board");
        double pricePerBoard = Double.parseDouble(keyboard.nextLine());

        double totalBoardCost = numberOfBoardsRequired * pricePerBoard;

        if ( totalBoardCost >= 2_000 ) {
            totalBoardCost *= .85;
        } else if ( totalBoardCost >= 1_000){
            totalBoardCost *= .9;
        }

        System.out.println("Enter the amount of hours you estimate the job to take");
        double hoursEstimate = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter your hourly rate");
        double hourlyRate = Double.parseDouble(keyboard.nextLine());

        double laborCost = hourlyRate * hoursEstimate;

        System.out.println("Do you want to offer a discount on the labor? (y/n)");
        String discountYN = keyboard.nextLine();

        if ( discountYN.equalsIgnoreCase("y")){
            System.out.println("What % discount are you giving? (1-100)");
            double discount = Double.parseDouble(keyboard.nextLine())/100;

            laborCost *= (1-discount);
        }

        System.out.println("Total material cost: $" + totalBoardCost);
        System.out.println("Total labor cost: $" + laborCost);
        System.out.println("Grand Total: $" + (totalBoardCost + laborCost));

    }
}