// openai chatgpt
// prompt : write a java class for electric vehicle

public class ElectricVehicleFromChatBot {
    private String make;
    private String model;
    private double batteryCapacity;
    private double currentChargeLevel;

    private double kilometersPerKilowattHour;

    public ElectricVehicleFromChatBot(String make, String model, double batteryCapacity, double kilometersPerKilowattHour) {
        this.make = make;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.kilometersPerKilowattHour = kilometersPerKilowattHour;
        this.currentChargeLevel = 0;
    }

    public void charge(double chargeAmount) {
        double newChargeLevel = currentChargeLevel + chargeAmount;
        currentChargeLevel = Math.min(newChargeLevel, batteryCapacity);
    }

    public void drive(double distance) {
        double maxDistance = currentChargeLevel * kilometersPerKilowattHour; // assuming 1% charge = 10km range
        double actualDistance = Math.min(distance, maxDistance);
        currentChargeLevel -= actualDistance / kilometersPerKilowattHour;
        // check for negative
        
        System.out.println("Driving " + actualDistance + " km");
    }

    public void displayChargeLevel() {
        System.out.println("Current charge level: " + currentChargeLevel + " / " + batteryCapacity);
    }
}
