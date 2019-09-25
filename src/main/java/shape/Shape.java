package shape;

public class Shape {

    private double length;
    private double width;

    public Shape() {

    }
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //Getter
   public double getLength() {
        return this.length;
   }
   //Setter
//    public void setLength(double length) {
//        this.length = length;
//    }

    public void calcArea() {
        System.out.println(length * width);
    }
}
