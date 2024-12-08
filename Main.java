public class Main {
    public static void main(String[] args) {
        // Create Customer
        Customer customer = new Customer("John Doe", "123 Main Street");

        // Create Items
        Item item1 = new Item("Laptop", 2.5);
        Item item2 = new Item("Mouse", 0.2);

        // Create OrderDetails
        OrderDetail detail1 = new OrderDetail(item1, 1, "Taxable");
        OrderDetail detail2 = new OrderDetail(item2, 2, "Taxable");

        // Create Order
        Order order = new Order("2024-12-08", "Processing", customer);
        order.addOrderDetail(detail1);
        order.addOrderDetail(detail2);

        // Create Payment
        Payment payment = new Credit(order.calcTotal(), "1234-5678-9876", "Visa", "12/26");

        // Display Order and Payment Info
        System.out.println(order);
        System.out.println("Payment Amount: " + payment.amount + ", Authorized: " + payment.authorized());
    }
}
