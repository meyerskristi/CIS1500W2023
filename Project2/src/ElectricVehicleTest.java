import static org.junit.jupiter.api.Assertions.*;

class ElectricVehicleTest {

    @org.junit.jupiter.api.Test
    void driveReturnsTrue() {
        // Arrange
        double expectedKilowattHoursInBattery = 9;
        ElectricVehicle vehicle = new ElectricVehicle(10, 10, "", "", "");
        vehicle.charge(10);

        // Act
        boolean result = vehicle.drive(10);
        double actualKilowattHoursInBattery = vehicle.getKilowattHoursInBattery();

        // Assert
        assertTrue(result);
        assertEquals(expectedKilowattHoursInBattery, actualKilowattHoursInBattery);

    }

    @org.junit.jupiter.api.Test
    void driveReturnsFalse() {
        // Arrange
        double expectedKilowattHoursInBattery = 0;
        ElectricVehicle vehicle = new ElectricVehicle(10, 10, "", "", "");

        // Act
        boolean result = vehicle.drive(10);
        double actualKilowattHoursInBattery = vehicle.getKilowattHoursInBattery();

        // Assert
        assertFalse(result);
        assertEquals(expectedKilowattHoursInBattery, actualKilowattHoursInBattery);

    }

    @org.junit.jupiter.api.Test
    void chargeReturnsTrue() {
        // Arrange
        double expectedKilowattHoursInBattery = 10;
        ElectricVehicle vehicle = new ElectricVehicle(10, 10, "", "", "");

        // Act
        boolean result = vehicle.charge(expectedKilowattHoursInBattery);
        double actualKilowattHoursInBattery = vehicle.getKilowattHoursInBattery();

        // Assert
        assertTrue(result);
        assertEquals(expectedKilowattHoursInBattery, actualKilowattHoursInBattery);
    }

    @org.junit.jupiter.api.Test
    void chargeReturnsFalse() {
        // Arrange
        double expectedKilowattHoursInBattery = 0;
        ElectricVehicle vehicle = new ElectricVehicle(10, 10, "", "", "");

        // Act
        boolean result = vehicle.charge(20);
        double actualKilowattHoursInBattery = vehicle.getKilowattHoursInBattery();

        // Assert
        assertFalse(result);
        assertEquals(expectedKilowattHoursInBattery, actualKilowattHoursInBattery);
    }
}