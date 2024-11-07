public class Triangle extends Shape{
    private double height;
    private double base;

    // Constructors
    public Triangle(){

    }
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    // Getters & setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        return Math.round(0.5 * base * height * 100.0) / 100.0;
    }

    @Override
    public double calculateCircumference() {
        double sideLength = (2 * height) / Math.sqrt(3);
        return Math.round(3 * sideLength * 100.0) / 100.0; // Calculations for equilateral triangles only
    }

    // toString method
    @Override
    public String toString() {
        return "height of " + height +
                " and base of" + base;
    }
}