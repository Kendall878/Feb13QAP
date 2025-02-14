// Test driver for MyRectangle

public class TestMyRectangle {
    public static void main(String[] args) {
        // Creating two points
        MyPoint p1 = new MyPoint(2, 8);
        MyPoint p2 = new MyPoint(10, 2);

        // Creating a rectangle with these points
        MyRectangle rect = new MyRectangle(p1, p2);

        // Displaying rectangle information
        System.out.println("Rectangle Details: " + rect);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        // Modifying rectangle's points
        rect.setTopLeft(new MyPoint(1, 9));
        rect.setBottomRight(new MyPoint(9, 3));

        // Display updated rectangle details
        System.out.println("\nUpdated Rectangle Details: " + rect);
        System.out.println("New Area: " + rect.getArea());
        System.out.println("New Perimeter: " + rect.getPerimeter());
    }
}
