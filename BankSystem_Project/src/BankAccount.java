import java.util.Scanner;


public class BankAccount {
    private String accountNum;
    private String timePassed;
    private Customer owner;
    private String balance;
    private final static double interest =0.03; 
    public BankAccount(String accountNum, Customer cust, String timePassed,String balance) {
        this.accountNum = accountNum;
        this.timePassed = timePassed;
        this.owner=owner;
        //setOwner(owner);
        this.balance=balance;
    }

    public BankAccount(String accountNum, String timePassed, Customer owner, String initialBalance) {
		// TODO Auto-generated constructor stub
	}

	public void getInput1() {
        System.out.println("Enter owner details:");
       owner.getInput();
        
    }
    public String getBalance() {
		return balance;
	}

	public void setBalance(String newbalance) {
		this.balance = balance;
	}

	

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getTimePassed() {
        return timePassed;
    }

    public void setTimePassed(String timePassed) {
        this.timePassed = timePassed;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        if (owner != null) {
            this.owner = owner;
        }
    }
Scanner scanner=new Scanner(System.in);
    public void getInput() {
        System.out.println("Enter owner:");
        //owner=scanner.nextLine();
        
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNum +
                "\nTime Passed: " + timePassed +
                "\nOwner: " + owner.toString();
    }

	public String getBalance1() {
		// TODO Auto-generated method stub
		return "0";
	}

	
	public String withdraw(String amount) {
		return amount;
		// TODO Auto-generated method stub
		
	}

	public void calculatefinalBalance() {
		
		//balance=balance*timePassed*interest;
		
	}

	
	
}

