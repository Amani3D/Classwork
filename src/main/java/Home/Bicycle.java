package Home;

public class Bicycle {

    public double cadence;
    public double gear;
    public double speed;

    public Bicycle(double cadence, double gear, double speed){
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(double slowDown){

        System.out.println(speed - slowDown );
    }

    public void speedUp(double goFast){

        System.out.println(speed + goFast);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
