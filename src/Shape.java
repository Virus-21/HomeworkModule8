public abstract class Shape {
    public String name;


    Shape(String name) {
        this.name = name;
    }

    abstract public String getName();

    public void printName() {
        System.out.println("Shape name = " + this.name);
    }
}
