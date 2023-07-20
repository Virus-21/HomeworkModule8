public  class Shape {
    private String name;


    Shape(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printName(){
        System.out.println("Shape name = " +this.name);
    }
}
