
public class Deposit extends Transaction {
    private double amount;
    private double newbalance;

    //BankAccount account = new BankAccount();
    
    
    public Deposit(double amount, BankAccount bankAccount) {
        super(bankAccount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void execute() {
    	 //newbalance= getBankAccount().getBalance()+amount;
         //getBankAccount().setBalance(newbalance);
    	
    }

    @Override
    public String toString() {
        return "Deposit Transaction\n" +
                super.toString() +
                "\nAmount: " + amount;
    }

	@Override
	public void calculateCommission() {
		// TODO Auto-generated method stub
		
	}
}