import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number 1-10!");

        int number = Integer.parseInt(keyboard.nextLine());

        // validation loop
        //while ( number < 1 || number > 10 ){
        while ( !( number >= 1 && number <= 10 )) {
           // System.out.println(number);
           // number--;
            //number -= 1;
            //number = number - 1;

            System.out.println("Enter a number 1-10!");

            number = Integer.parseInt(keyboard.nextLine());

        }

        System.out.println("Do you want to buy Tacos, Croissant, Quesadilla");

        String choice = keyboard.nextLine();

        while ( !(choice.equalsIgnoreCase("tacos") ||
        choice.equalsIgnoreCase("Croissant") ||
        choice.equalsIgnoreCase("Quesadilla")) ) {
            System.out.println("There's no secret menu");
            System.out.println("Do you want to buy Tacos, Croissant, Quesadilla");

            choice = keyboard.nextLine();
        }

        while ( !choice.equalsIgnoreCase("tacos")
        &&  !choice.equalsIgnoreCase("Croissant")
        && !choice.equalsIgnoreCase("Quesadilla") ){
            System.out.println("There's no secret menu");
            System.out.println("Do you want to buy Tacos, Croissant, Quesadilla");

            choice = keyboard.nextLine();
        }

        System.out.println("Blast off!");


        System.out.println("How much money do you have in the bank?");
        double moneyInTheBank = Double.parseDouble(keyboard.nextLine());

        System.out.println("How many years until you retire?");
        int yearsUntilRetirement = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the expected interest rate between 0-1");
        double interestRate = Double.parseDouble(keyboard.nextLine());

        while ( !(interestRate >= 0 && interestRate <= 1)){
            System.out.println("Enter the expected interest rate between 0-1");
            interestRate = Double.parseDouble(keyboard.nextLine());
        }

        System.out.println("How much money will you add every year?");
        int moneyAddedEveryYear = Integer.parseInt((keyboard.nextLine()));

        int year = 0;

        while ( year < yearsUntilRetirement ){
            year++;
            moneyInTheBank += moneyAddedEveryYear;
            moneyInTheBank *= ( 1 + interestRate);
            System.out.println("At year " + year + " your bank savings is: $" + moneyInTheBank);

        }
        // ( create a loop variable ; boolean condition ; update )
        for ( int otherYear = 0; otherYear < yearsUntilRetirement; otherYear++ ){
            moneyInTheBank += moneyAddedEveryYear;
            moneyInTheBank *= ( 1 + interestRate);
            System.out.println("At year " + otherYear + " your bank savings is: $" + moneyInTheBank);
        }



        int reminders = 0;
        do {
            System.out.println("Don't forget to feed the cats!");
            reminders++;
        } while ( reminders < 5 );

        // no semi colons in regular while loops
       // while ( reminders < 10 );{
        //    System.out.println("More reminder");
       // }

        double sum = 0;

        System.out.println("Enter the receipt total or 0 to stop");
        double receipt = Double.parseDouble(keyboard.nextLine());

        while ( receipt != 0){
            sum += receipt;

            System.out.println("Enter the receipt total or 0 to stop");
            receipt = Double.parseDouble(keyboard.nextLine());
        }

        System.out.println("How large of a square do you want?");
        int size = Integer.parseInt(keyboard.nextLine());

        for ( int row = 0; row < size; row++){
            for ( int column = 0; column < size; column++ ){
                System.out.print("* ");
            }
            System.out.println();
        }


        for ( int row = 0; row < size; row++){
            for ( int column = 0; column <= row; column++ ){
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}