public class Main {
    public static void main(String[] args) {
        //***************************** 1. Circle class testing *****************************
        // 1. Create two Circle objects
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle();
        circle2.setRadius(6);// Set the radius

        // 2. Calculate the area of the circle1 and print the result (using getters)
        System.out.println("---------------------------------- Circle1 ----------------------------------"
                + "\nThe area of the circle with radius of " + circle1.getRadius()
                + " is: " + circle1.calculateArea());

        // 3. Calculate the circumference of the circle1 and print the result (using getters)
        System.out.println("The circumference of the circle with radius of " + circle1.getRadius()
                + " is: " + circle1.calculateCircumference());

        // 4. Calculate the area of the circle2 and print the result (using toString)
        System.out.println("\n---------------------------------- Circle2 ----------------------------------"
                + "\nThe area of the circle with " + circle2.toString()
                + " is: " + circle2.calculateArea());

        // 5. Calculate the circumference of the circle2 and print the result (using toString)
        System.out.println("The circumference of the circle with " + circle2.toString()
                + " is: " + circle2.calculateCircumference());

        //***************************** 2. Rectangle class testing *****************************
        // 1. Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(20,40);
        Rectangle rectangle2 = new Rectangle();
        // Set values for rectangle2
        rectangle2.setHeight(50);
        rectangle2.setWidth(100);

        // 2. Calculate the area of the rectangle1 and print the result (using getters)
        System.out.println("\n---------------------------------- Rectangle1 ----------------------------------"
                + "\nThe area of the rectangle with height of " + rectangle1.getHeight()
                + " and width of " + rectangle1.getWidth() + " is: " + rectangle1.calculateArea());

        // 3. Calculate the perimeter of the rectangle1 and print the result (using getters)
        System.out.println("The perimeter of the rectangle with height of " + rectangle1.getHeight()
                + " and width of " + rectangle1.getWidth() + " is: " + rectangle1.calculateCircumference());

        // 4. Calculate the area of the rectangle2 and print the result (using toString)
        System.out.println("\n---------------------------------- Rectangle2 ----------------------------------"
                + "\nThe area of the rectangle with " + rectangle2.toString()
                + " is: " + rectangle2.calculateArea());

        // 5. Calculate the perimeter of the rectangle2 and print the result (using toString)
        System.out.println("The perimeter of the rectangle with " + rectangle2.toString()
                + " is: " + rectangle1.calculateCircumference());


        //***************************** 3. Triangle class testing *****************************
        // 1. Create two triangle objects
        Triangle triangle1 = new Triangle(40,3);
        Triangle triangle2 = new Triangle();
        //Set values for triangle2
        triangle2.setHeight(80);
        triangle2.setBase(6);

        // 2. Calculate the area of the triangle2 and print the result (using getters)
        System.out.println("\n---------------------------------- Triangle1 -----------------------------------"
                + "\nThe area of the triangle with height of " + triangle1.getHeight()
                + " and base of " + triangle1.getBase() + " is: " + triangle1.calculateArea());

        // 3. Calculate the perimeter of the triangle2 and print the result (using getters)
        System.out.println("The perimeter of the triangle with height of " + triangle1.getHeight()
                + " and base of " + triangle1.getBase() + " is: " + triangle1.calculateCircumference());

        // 4. Calculate the area of the triangle2 and print the result (using toString)
        System.out.println("\n---------------------------------- Triangle2 -----------------------------------"
                + "\nThe area of the triangle with " + triangle2.toString()
                + " is: " + triangle2.calculateArea());

        // 5. Calculate the perimeter of the triangle2 and print the result (using toString)
        System.out.println("The perimeter of the triangle with " + triangle2.toString()
                + " is: " + triangle2.calculateCircumference());
    }
}