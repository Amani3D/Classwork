package Home;

public class Triangle {

    public double base;
    public double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void calculateArea(){

        System.out.println(height * base);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
