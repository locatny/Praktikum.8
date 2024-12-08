public class Credit extends Payment {
    private final String number;
    private final String type;
    private final String expDate;

    public Credit(double amount, String number, String type, String expDate) {
        super(amount);
        this.number = number;
        this.type = type;
        this.expDate = expDate;
    }

    @Override
    public boolean authorized() {
        // For simplicity, assume all credit payments are authorized
        return true;
    }
}
