public class Rectangle extends Shape implements  SquareCounter{
    private double a;
    private double b;
    public Rectangle(String name,double a,double b) {
        super(name);
        this.b =b;
        this.a = a;
    }

    @Override
    public double countSquare() {
        return b * a;
    }
}
