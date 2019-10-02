package fridaythe13;

public class Vendor implements IPay{

    private int quantity;
    private double pricePerItem;

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public Vendor(int quantity, double pricePerItem) {
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem() {
        this.pricePerItem = pricePerItem;
    }
}
