package Home;

public class Circle {

    public double radius;
    public double PI;

    public Circle(double radius, double PI){
        this.radius = radius;
        this.PI = PI;
    }

    public void calculateArea(){
        System.out.println(PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
