package Home;

public class Shape {

    private double side;

    public Shape(double side) {
        this.side = side;
    }
     class Rectangle extends Shape
    {

        public Rectangle(double side) {
            super(side);

        }

    public void draw() {
        fillin("Red");
        System.out.println("The shape is drawn.");

    }


    private String fill(String color){
        return "The color of the shape is " + color;
    }
    private void fillin(String color){
        System.out.println(fill(color));
    }


    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                '}';
    }

    }
}
