public class Circle extends Shape implements SquareCounter{


    private double radius;
    public Circle(String name,double radius) {
        super(name);

        this.radius = radius;
    }



    @Override
    public double countSquare() {
        return Math.PI * Math.pow(radius,2);
    }
}
