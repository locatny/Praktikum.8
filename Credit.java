public class Credit extends Payment {
    private String number;
    private String type;
    private String expDate;

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
