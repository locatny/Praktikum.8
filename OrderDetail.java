public class OrderDetail {
    private final int quantity;
    private final String taxStatus;
    private final Item item;

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
