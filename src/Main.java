// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TEST

        Circle c1 = new Circle("circle", 4);
        Triangle t1 = new Triangle("triangle", 4, 5, 6);
        Quad q1 = new Quad("quad", 4);
        Rectangle r1 = new Rectangle("rectangle", 4, 2);
        Ellipse e1 = new Ellipse("elipse", 4, 3);
        System.out.println("Statement: " + c1.getName() + " is bigger than " + t1.getName() + " is " + SquareComparion.isBigger(c1, t1));
        System.out.println("Statement: " + r1.getName() + " is bigger than " + e1.getName() + " is " + SquareComparion.isBigger(r1, e1));
        System.out.println("Statement: " + q1.getName() + " is bigger than " + c1.getName() + " is " + SquareComparion.isBigger(q1, c1));
        Shape[] shapes = {c1, t1, q1, r1, e1};
        for (Shape shape : shapes) {
            NamePrinter.printName(shape);
        }
        SquareCounter[] squaresCounter = {c1, t1, q1, r1, e1};
        for (SquareCounter squareCounter : squaresCounter) {
            System.out.println("Square Shape = " + squareCounter.countSquare());
        }
    }
}