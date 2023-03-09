public class Circle extends TwoDShape{
    public final double PI = Math.PI;

    private double radius;

    //Default Constructor
    public Circle(double width, double height, Colour colour){
        super(width, height, colour);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    //Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Find the area of a circle base on its radius.
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        double area = radius * radius * PI;
        return area;
    }

    /**
     * Change the radius of the circle to a string.
     * @return the radius of the circle. For example, Radius: 4.0
     */
    public String toString(){
        return "Radius:" + radius;
    }
}
