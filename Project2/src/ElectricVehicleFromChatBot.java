// openai chatgpt
// prompt : write a java class for electric vehicle

public class ElectricVehicleFromChatBot {
    private String make;
    private String model;
    private int batteryCapacity;
    private int currentChargeLevel;

    public ElectricVehicle(String make, String model, int batteryCapacity) {
        this.make = make;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.currentChargeLevel = 0;
    }

    public void charge(int chargeAmount) {
        int newChargeLevel = currentChargeLevel + chargeAmount;
        currentChargeLevel = Math.min(newChargeLevel, batteryCapacity);
    }

    public void drive(int distance) {
        int maxDistance = currentChargeLevel * 10; // assuming 1% charge = 10km range
        int actualDistance = Math.min(distance, maxDistance);
        currentChargeLevel -= actualDistance / 10;
        System.out.println("Driving " + actualDistance + " km");
    }

    public void displayChargeLevel() {
        System.out.println("Current charge level: " + currentChargeLevel + " / " + batteryCapacity);
    }
}
