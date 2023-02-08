import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello world!");

        sayHappyDay("Tuesday!");

        System.out.println("Enter your name");
        String name = keyboard.nextLine();

        System.out.println("Enter your age");
        int age = Integer.parseInt(keyboard.nextLine());

        double discount = askForValueInRange(
                "Enter a % discount",1, 100);
    }

    public static void sayHappyDay(String day){
        System.out.println("Happy " + day);
        System.out.println("Happy " + day);
        System.out.println("Happy " + day + " oh happy day to you!");
        System.out.println("Happy " + day);
    }

    public static double askForValueInRange(String prompt, double lowerBound, double upperBound){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt + lowerBound + " to " + upperBound);
        double discount = Double.parseDouble(keyboard.nextLine());

        while ( discount < lowerBound || discount > upperBound ){
            System.out.println("Invalid entry try again please");

            System.out.println(prompt + lowerBound + " to " + upperBound);
            discount = Double.parseDouble(keyboard.nextLine());
        }

        return discount;
    }

}