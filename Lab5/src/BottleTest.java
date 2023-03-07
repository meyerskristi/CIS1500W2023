import static org.junit.jupiter.api.Assertions.*;

class BottleTest {

    @org.junit.jupiter.api.Test
    void drinkSuccessful() {
        // AAA

        // Arrange
        int currentMillilitersInBottle = 100;
        int expectedMillilitersInBottle = 20;
        Bottle bottle = new Bottle(currentMillilitersInBottle, currentMillilitersInBottle, "");

        // Act
        boolean result = bottle.drink(80);
        int actualMillilitersInBottle = bottle.getCurrentVolumeInMilliliters();

        // Assert
        assertTrue(result);
        assertEquals(expectedMillilitersInBottle, actualMillilitersInBottle);

    }

    @org.junit.jupiter.api.Test
    void drinkUnsuccessfulOverCurrent() {

        // AAA

        // Arrange
        int currentMillilitersInBottle = 100;
        int expectedMillilitersInBottle = 100;
        Bottle bottle = new Bottle(currentMillilitersInBottle, currentMillilitersInBottle, "");

        // Act
        boolean result = bottle.drink(currentMillilitersInBottle+1);
        int actualMillilitersInBottle = bottle.getCurrentVolumeInMilliliters();

        // Assert
        assertFalse(result);
        assertEquals(expectedMillilitersInBottle, actualMillilitersInBottle);
    }

    @org.junit.jupiter.api.Test
    void drinkUnsuccessfulNegativeValue() {

        // AAA

        // Arrange
        int currentMillilitersInBottle = 100;
        int expectedMillilitersInBottle = 100;
        Bottle bottle = new Bottle(currentMillilitersInBottle, currentMillilitersInBottle, "");

        // Act
        boolean result = bottle.drink(-1);
        int actualMillilitersInBottle = bottle.getCurrentVolumeInMilliliters();

        // Assert
        assertFalse(result);
        assertEquals(expectedMillilitersInBottle, actualMillilitersInBottle);
    }

    @org.junit.jupiter.api.Test
    void fillSuccessful() {
        // AAA

        // Arrange
        int maxMillilitersInBottle = 100;
        int currentMillilitersInBottle = 0;
        int expectedMillilitersInBottle = 20;
        Bottle bottle = new Bottle(maxMillilitersInBottle, currentMillilitersInBottle, "");

        // Act
        boolean result = bottle.fill(expectedMillilitersInBottle);
        int actualMillilitersInBottle = bottle.getCurrentVolumeInMilliliters();

        // Assert
        assertTrue(result);
        assertEquals(expectedMillilitersInBottle, actualMillilitersInBottle);

    }

    @org.junit.jupiter.api.Test
    void fillUnsuccessfulOverMax() {

        // AAA

        // Arrange
        int currentMillilitersInBottle = 100;
        int expectedMillilitersInBottle = 100;
        Bottle bottle = new Bottle(currentMillilitersInBottle, currentMillilitersInBottle, "");

        // Act
        boolean result = bottle.fill(1);
        int actualMillilitersInBottle = bottle.getCurrentVolumeInMilliliters();

        // Assert
        assertFalse(result);
        assertEquals(expectedMillilitersInBottle, actualMillilitersInBottle);
    }

    @org.junit.jupiter.api.Test
    void fillUnsuccessfulNegativeFill() {

        // AAA

        // Arrange
        int currentMillilitersInBottle = 100;
        int expectedMillilitersInBottle = 100;
        Bottle bottle = new Bottle(currentMillilitersInBottle, currentMillilitersInBottle, "");

        // Act
        boolean result = bottle.fill(-1);
        int actualMillilitersInBottle = bottle.getCurrentVolumeInMilliliters();

        // Assert
        assertFalse(result);
        assertEquals(expectedMillilitersInBottle, actualMillilitersInBottle);
    }
}