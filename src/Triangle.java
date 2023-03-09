public class Triangle extends TwoDShape implements Rotate{
    private double side1;
    private double side2;
    private double side3;
    private int angle = 0;

    //Default Constructor
    public Triangle(double width, double height, Colour colour){
        super(width, height, colour);
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Getter and Setters
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    /**
     * Takes a triangle object and the length of its three sides and find its height
     * @return The height of the triangle perpendicular to side2
     */

    public double heronsHeight(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
        double height = area/(2 * side2);
        return height;
    }

    /**
     * Find the Area of the Triangle base on its height perpendicular to side2
     * @return the area of the triangle
     */
    public double getArea(){
        return (heronsHeight() * side2)/2;
    }

    /**
     * Change the height of the triangle perpendicular to side2 to a string.
     * @return the height. For example, Height: 5.0
     */

    public String toString(){
        return "Height:" + heronsHeight();
    }

    /**
     * Change the angle of the object between 0 and 360 degrees by 90 degrees.
     */
    @Override
    public void rotate90() {
        angle += 90;
        if(angle >= 360){
            angle -= 360;
        }
    }

    /**
     * Change the angle of the object between 0 and 360 degrees by 180 degrees.
     */
    @Override
    public void rotate180() {
        angle += 180;
        if(angle > 360){
            angle -= 360;
        }
    }

    /**
     * Change the angle of the object between 0 and 360 degrees base on the parameter.
     * @param degree a double
     */
    @Override
    public void rotate(double degree) {
        angle += degree;
        if(angle > 360){
            angle -= 360;
        }
    }
}
