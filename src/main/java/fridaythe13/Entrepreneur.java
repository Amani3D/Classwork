package fridaythe13;

public class Entrepreneur extends Person {

    private double investment;
    private double revenue;

    public Entrepreneur(String name, double investment, double revenue) {
        super(name);
        this.investment = investment;
        this.revenue = revenue;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment() {
        System.out.println(investment);
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue() {
        System.out.println(revenue);
    }


    @Override
    public void printProfile() {
        System.out.println("I am an entrepreneur.");
    }

    @Override
    public String toString() {
        return "Entrepreneur's name is : " + this.getName();
    }

    public double calculateProfits() {
        return investment - revenue;
    }

}
