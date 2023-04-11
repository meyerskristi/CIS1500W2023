import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ElectricVehicle vehicle = new ElectricVehicle(10, 10, "", "", "");


        double kilowattHoursToCharge = 0;
        while (kilowattHoursToCharge == 0) {
            try {
                System.out.println("How many kilowatt hours do you want to charge?");
                kilowattHoursToCharge = Double.parseDouble(keyboard.nextLine());
                vehicle.charge(kilowattHoursToCharge);
            } catch (NumberFormatException ex) {
                System.out.println(ex);
            } catch ( IllegalArgumentException ex){
                System.out.println(ex);
                kilowattHoursToCharge = 0; // make the loop run again
            }
        }

        double kilometersToDrive = 0;
        while (kilometersToDrive == 0) {
            try {
                System.out.println("How many kilometers do you want drive??");
                kilometersToDrive = Double.parseDouble(keyboard.nextLine());
                vehicle.drive(kilometersToDrive);
            } catch (NumberFormatException ex) {
                System.out.println(ex);
            } catch ( IllegalArgumentException ex){
                System.out.println(ex);
                kilometersToDrive = 0; // make the loop run again
            }
        }


    }
}