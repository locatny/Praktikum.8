import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String date;
    private final String status;
    private final Customer customer;
    private final List<OrderDetail> orderDetails = new ArrayList<>();

    public Order(String date, String status, Customer customer) {
        this.date = date;
        this.status = status;
        this.customer = customer;
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    public double calcTotal() {
        double total = 0.0;
        for (OrderDetail od : orderDetails) {
            total += od.calcSubTotal() + od.calcTax();
        }
        return total;
    }

    public double calcTotalWeight() {
        double totalWeight = 0.0;
        for (OrderDetail od : orderDetails) {
            totalWeight += od.calcWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Order Date: " + date + ", Status: " + status + "\nCustomer Info: " + customer +
               "\nOrder Total: " + calcTotal() + ", Total Weight: " + calcTotalWeight();
    }
}

