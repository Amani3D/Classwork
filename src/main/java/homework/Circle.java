package homework;

public class Circle {

    private double radius;
    private double PI;

    public Circle(double radius, double PI){
        this.radius = radius;
        this.PI = PI;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setPI(double PI){
        this.PI = PI;
    }

    public void calculatearea() {
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

