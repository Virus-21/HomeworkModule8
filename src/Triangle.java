import java.lang.management.MemoryType;

public class Triangle extends Shape implements SquareCounter{


    private double a;
    private double b;
    private double c;
    private double perimetr;

    public Triangle(String name,double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;

        if(!(((a + b) > c) && ((a + c) > b) && ((b + c) > c)) ){
            System.out.println("You can`t create this triangle. Set another values");
        }


    }


    public void setA(double a) {
        this.a = a;

    }

    public void setB(double b) {
        this.b = b;

    }

    public void setC(double c) {
        this.c = c;

    }

    @Override
    public double countSquare() {
        perimetr = a+b+c;
        double halfParimetr = perimetr/2;
        double square = Math.sqrt(halfParimetr*(halfParimetr-a)*(halfParimetr-b)*(halfParimetr - c));
        return square;
    }


}
