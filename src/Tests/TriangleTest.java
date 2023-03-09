
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    /**
     *Partitioned the inputs as follows:
     * side1 > side 2 > side 3
     * side1 > side 3 > side 2
     * side 2 > side 3 > side 1
     * side 2 > side 1 > side 3
     * Side 3 > side 2 > side 1
     * Side 3 > side 1 > side 2
     *
     * side 1 = 0
     * side 2 = 0
     * side 3 = 0
     */
    @Test public void testGetArea(){
        int constant = 2;

        Triangle triangle1 = new Triangle(5,4,3);
        Triangle triangle2 = new Triangle(5,3,4);
        Triangle triangle3 = new Triangle(3,5,4);
        Triangle triangle4 = new Triangle(4,5,3);
        Triangle triangle5 = new Triangle(3,4,5);
        Triangle triangle6 = new Triangle(4,3,5);
        Triangle triangle7 = new Triangle(0,4,5);
        Triangle triangle8 = new Triangle(3,0,5);
        Triangle triangle9 = new Triangle(3,4,0);

        assertEquals((triangle1.heronsHeight() * triangle1.getSide2()) / constant, triangle1.getArea(), 0.0);
        assertEquals((triangle2.heronsHeight() * triangle2.getSide2()) / constant, triangle2.getArea(), 0.0);
        assertEquals((triangle3.heronsHeight() * triangle3.getSide2()) / constant, triangle3.getArea(), 0.0);
        assertEquals((triangle4.heronsHeight() * triangle4.getSide2()) / constant, triangle4.getArea(), 0.0);
        assertEquals((triangle5.heronsHeight() * triangle5.getSide2()) / constant, triangle5.getArea(), 0.0);
        assertEquals((triangle6.heronsHeight() * triangle6.getSide2()) / constant, triangle6.getArea(), 0.0);
        assertEquals((triangle7.heronsHeight() * triangle7.getSide2()) / constant, triangle7.getArea(), 0.0);
        assertEquals((triangle8.heronsHeight() * triangle8.getSide2()) / constant, triangle8.getArea(), 0.0);
        assertEquals((triangle9.heronsHeight() * triangle9.getSide2()) / constant, triangle9.getArea(), 0.0);
    }

}