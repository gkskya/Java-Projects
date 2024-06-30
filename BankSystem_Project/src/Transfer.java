public class Transfer extends Transaction {
    private double amount;
    private BankAccount recipient;
    private double newbalance;


    public Transfer(double amount, BankAccount senderAccount, BankAccount recipientAccount) {
        super(senderAccount);
        this.amount = amount;
        this.recipient = recipientAccount;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getRecipient() {
        return recipient;
    }

    @Override
    public void execute() {
    	    	 //newbalance= getBankAccount().getBalance()-amount;
        // getBankAccount().setBalance(newbalance);
    }

    @Override
    public String toString() {
        return "Transfer Transaction\n" +
                super.toString() +
                "\nAmount: " + amount +
                "\nRecipient Bank Account: " + recipient.toString();
    }

	@Override
	public void calculateCommission() {
		// TODO Auto-generated method stub
		
	}
}
