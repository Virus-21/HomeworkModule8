public class Ellipse extends Shape implements SquareCounter{
    private double bigRadius;
    private double smallRadius;

    public Ellipse(String name, double bigRadius, double smallRadius) {
        super(name);
        this.bigRadius = bigRadius;
        this.smallRadius = smallRadius;
    }

    @Override
    public double countSquare() {
        return Math.PI * smallRadius * bigRadius;
    }
}
