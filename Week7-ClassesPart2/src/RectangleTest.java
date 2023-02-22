import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void getArea() {
        //  AAA format

        // Arrange - setup the variables we need to test
        int length = 10;
        int width = 20;
        int expectedArea = 200;
        Rectangle rectangle = new Rectangle(length, width);

        // Act - call the code we're testing and get values
        int actualArea = rectangle.getArea();

        // Assert - did we get what we expected?
        assertEquals(expectedArea, actualArea);
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        //  AAA format

        // Arrange - setup the variables we need to test
        int length = 10;
        int width = 20;
        int expectedPerimeter = 60;
        Rectangle rectangle = new Rectangle(length, width);

        // Act - call the code we're testing and get values
        int actualPerimeter = rectangle.getPerimeter();

        // Assert - did we get what we expected?
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @org.junit.jupiter.api.Test
    void setWidthTest() {
        //  AAA format

        // Arrange - setup the variables we need to test
        int length = 10;
        int width = 20;
        Rectangle rectangle = new Rectangle(length, length);

        // Act - call the code we're testing and get values
        rectangle.setWidth(width);
        int actualWidth = rectangle.getWidth();

        // Assert - did we get what we expected?
        assertEquals(width, actualWidth);


        boolean someResult = false;

        assertFalse(someResult);
    }
}