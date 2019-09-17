package Home;

public class work {

    public double length;

    public work(double length){

        this.length = length;
    }

    public void calculateArea(){

        System.out.println(length * length);
    }

    @Override
    public String toString() {
        return "work{" +
                "length=" + length +
                '}';
    }
}


