package homework;

public class Square {

    private double length;
    private double width;


    public Square(double length, double width) {
        this.length = length;
        this.length = width;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public void setwidth(double width) {
        this.width = width;
    }
    public void calcArea() {
        System.out.println(length * width);
    }
}



