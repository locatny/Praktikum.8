public class Item {
    private String description;
    private double shippingWeight;

    public Item(String description, double shippingWeight) {
        this.description = description;
        this.shippingWeight = shippingWeight;
    }

    public double getPriceForQuantity(int quantity) {
        return 10.0 * quantity; // Fixed price per item for simplicity
    }

    public double getTax() {
        return 0.1; // 10% tax
    }

    public boolean inStock() {
        return true; // Assume items are always in stock for this example
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    public String getDescription() {
        return description;
    }
}
