
public class Withdraw extends Transaction {
    private double amount;
    private double newbalance;


    public Withdraw(double amount, BankAccount bankAccount) {
        super(bankAccount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void execute() {
      //  newbalance= getBankAccount().getBalance()-amount;
        //getBankAccount().setBalance(newbalance);
    }

    @Override
    public String toString() {
        return "Withdrawal Transaction\n" +
                super.toString() +
                "\nAmount: " + amount;
    }

	@Override
	public void calculateCommission() {
		// TODO Auto-generated method stub
		
	}
}

