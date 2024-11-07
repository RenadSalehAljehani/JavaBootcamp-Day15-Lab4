public class Circle extends Shape{
    private double radius;

    // Constructors
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    // Setters & getters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public double calculateCircumference() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    // toString method
    @Override
    public String toString() {
        return "radius " + radius;
    }
}