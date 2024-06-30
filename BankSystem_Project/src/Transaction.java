
import java.time.LocalDateTime;

public abstract class Transaction implements ITransection {
    private LocalDateTime timestamp;
    private BankAccount bankAccount;
    protected int commission;

    public Transaction(BankAccount bankAccount) {
        this.timestamp = LocalDateTime.now();
        this.bankAccount = bankAccount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void execute() {
       
    	
    }

    @Override
    public String toString() {
        return "Timestamp: " + timestamp +
                "\nBank Account: " + bankAccount.toString();
    }
}
