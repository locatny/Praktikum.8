public class Check extends Payment {
    private String bankID;

    public Check(double amount, String bankID) {
        super(amount);
        this.bankID = bankID;
    }

    @Override
    public boolean authorized() {
        // Assume checks over $1000 are not authorized for simplicity
        return amount <= 1000;
    }
}
