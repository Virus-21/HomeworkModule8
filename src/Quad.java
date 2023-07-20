public class Quad extends Shape implements SquareCounter {

    private double side;

    public Quad(String name, double side) {
        super(name);

        this.side = side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double countSquare() {
        return side * side;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
