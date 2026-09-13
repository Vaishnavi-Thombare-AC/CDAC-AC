public class TestRectSq {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);

        Square square = new Square(5);

        System.out.println("Rectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();

        System.out.println();

        System.out.println("Square:");
        square.printArea();
        square.printPerimeter();
    }
}