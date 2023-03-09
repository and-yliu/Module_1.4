import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    /**
     * Partitioned the inputs as follows:
     * radius -> positive
     * radius = 0
     */
    @Test public void testGetArea(){
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(0.0);
        assertEquals(Math.pow(circle1.getRadius(),2) * circle1.PI, circle1.getArea(),0.0);
        assertEquals(Math.pow(circle2.getRadius(),2) * circle1.PI, circle2.getArea(), 0.0);
    }
}