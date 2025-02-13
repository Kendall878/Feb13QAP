public class TestMyLine {
    public static void main(String[] args) {
        // Creating MyLine objects
        MyLine line1 = new MyLine(1, 2, 3, 4);
        MyLine line2 = new MyLine(new MyPoint(3, 5), new MyPoint(8, 10));

        // Testing Getters and Setters
        System.out.println("Line 1 Begin: " + line1.getBegin());
        System.out.println("Line 1 End: " + line1.getEnd());
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 1 Gradient: " + line1.getGradient());

        System.out.println("Line 2 Begin: " + line2.getBegin());
        System.out.println("Line 2 End: " + line2.getEnd());
        System.out.println("Line 2 Length: " + line2.getLength());
        System.out.println("Line 2 Gradient: " + line2.getGradient());

        // Modify values
        line1.setBeginXY(2, 3);
        line1.setEndXY(5, 7);
        System.out.println("Updated Line 1: " + line1);

        line2.setBeginX(1);
        line2.setEndY(12);
        System.out.println("Updated Line 2: " + line2);
    }
}
