public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    public void printPerimeter() {
        System.out.println("Perimeter of rectangle: " + (2 * (length + breadth)));
    }
}