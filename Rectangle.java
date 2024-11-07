public class Rectangle extends Shape{
    private double height;
    private double width;

    // Constructors
    public Rectangle(){

    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Getters & setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        return Math.round(height * width * 100.0) / 100.0;
    }

    @Override
    public double calculateCircumference() {
        return Math.round(2 * (height + width) * 100.0) / 100.0;
    }

    // toString method
    @Override
    public String toString() {
        return "height of " + height +
                " and width of " + width;
    }
}