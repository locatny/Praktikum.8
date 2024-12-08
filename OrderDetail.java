public class OrderDetail {
    private int quantity;
    private String taxStatus;
    private Item item;

    public OrderDetail(Item item, int quantity, String taxStatus) {
        this.item = item;
        this.quantity = quantity;
        this.taxStatus = taxStatus;
    }

    public double calcSubTotal() {
        return item.getPriceForQuantity(quantity);
    }

    public double calcWeight() {
        return item.getShippingWeight() * quantity;
    }

    public double calcTax() {
        return calcSubTotal() * item.getTax();
    }

    @Override
    public String toString() {
        return "Item: " + item.getDescription() + ", Quantity: " + quantity +
               ", Subtotal: " + calcSubTotal() + ", Tax: " + calcTax();
    }
}
