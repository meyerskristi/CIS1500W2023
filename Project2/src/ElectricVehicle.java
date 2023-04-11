public class ElectricVehicle {
    private double kilowattHoursInBattery;
    private double maxKilowattHoursInBattery;
    private double kilometersPerKilowattHour;
    private String make;
    private String model;
    private String color;

    public ElectricVehicle(double maxKilowattHoursInBattery, double kilometersPerKilowattHour, String make, String model, String color) {
        this.maxKilowattHoursInBattery = maxKilowattHoursInBattery;
        this.kilometersPerKilowattHour = kilometersPerKilowattHour;
        this.make = make;
        this.model = model;
        this.color = color;
        kilowattHoursInBattery = 0;
    }

    public boolean drive(double kilometersToDrive)  throws IllegalArgumentException {
        double kilowattHoursRequiredForDistance = kilometersToDrive / kilometersPerKilowattHour;

        if (kilowattHoursRequiredForDistance > kilowattHoursInBattery) {
            throw new IllegalArgumentException("You can't drive that far");
        }

        kilowattHoursInBattery -= kilowattHoursRequiredForDistance;

        return true;
    }

    public boolean charge(double kilowattHoursToCharge) throws IllegalArgumentException {
        if ( kilowattHoursInBattery + kilowattHoursToCharge > maxKilowattHoursInBattery){
            throw new IllegalArgumentException("You can't charge that much");
        }

        kilowattHoursInBattery += kilowattHoursToCharge;
        return true;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKilowattHoursInBattery() {
        return kilowattHoursInBattery;
    }

    public double getMaxKilowattHoursInBattery() {
        return maxKilowattHoursInBattery;
    }

    public double getKilometersPerKilowattHour() {
        return kilometersPerKilowattHour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
