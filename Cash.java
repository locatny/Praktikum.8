public class Cash extends Payment {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public boolean authorized() {
        return true; // Cash is always authorized
    }
}
