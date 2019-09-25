package house;

public class House {

    private int windows;

    public House(int windows) {
        this.windows = windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }



    public void saleHouse(double priceToPay) {
        System.out.println("You said you want to pay: " + priceToPay);
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                '}';
    }
}




