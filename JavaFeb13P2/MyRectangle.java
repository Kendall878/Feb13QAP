// MyRectangle.java
// Represents a rectangle using two MyPoint instances.

class MyPoint {
    private int x, y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Get width (bottomRight.x - topLeft.x)
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Get height (topLeft.y - bottomRight.y)
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Calculate area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculate perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Getters
    public MyPoint getTopLeft() { return topLeft; }
    public MyPoint getBottomRight() { return bottomRight; }

    // Setters
    public void setTopLeft(MyPoint topLeft) { this.topLeft = topLeft; }
    public void setBottomRight(MyPoint bottomRight) { this.bottomRight = bottomRight; }

    // toString method
    @Override
    public String toString() {
        return "MyRectangle[Top Left=" + topLeft + ", Bottom Right=" + bottomRight + 
               ", Width=" + getWidth() + ", Height=" + getHeight() + "]";
    }
}