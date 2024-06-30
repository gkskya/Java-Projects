
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Scanner;

public  class BankSys {
    private static ArrayList<BankAccount> accounts;
    private static ArrayList<Customer> customers;

    public BankSys() {
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
    public static void readTxt(String fileName) {
    	File file = new File(fileName);
        Scanner scanner;
        String name, lastName,address, id, ssn;
        Customer cust;
        
        try {
        	scanner = new Scanner(file);
            while (scanner.hasNext()) {

            	String [] line = scanner.nextLine().split(",");
            	//int [] arr=scanner.nextInt().split("");
            	cust = new Customer(line[0],  line[1], line[2],  line[3],  line[4]);
                customers.add(cust);
                BankAccount ba = new BankAccount(line[5], cust,line[6],line[7] );
                accounts.add(ba);
                
            }
            
        } catch (Exception exc) {
			System.out.println(exc);
			
        }
    }

    public static boolean checkAcc(String accountNum) {
        for (BankAccount account : accounts) {
            if (account.getAccountNum() == accountNum) {
                return true;
            }
        }
        return false;
    }

    public static void addAcc(String accountNum, String timePassed, Customer owner, String initialBalance) {
        if (!checkAcc(accountNum)) {
        	 BankAccount newAccount = new BankAccount(accountNum, timePassed, owner, initialBalance);
            
            accounts.add(newAccount);
            
            System.out.println("Bank account with account number " + accountNum + " has been added.");
        } else {
            System.out.println("Bank account with account number " + accountNum + " already exists.");
        }
    }

    /*public Customer addCustomer(String name, String lastName, int id, String address, int ssn) {
        Customer customer = new Customer(name, lastName, id, address, ssn);
		return customer;
     
    }*/
    

    public static void removeAcc(String accountNum) {
        BankAccount account = searchAccount(accountNum);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Bank account with account number " + accountNum + " has been removed.");
        } else {
            System.out.println("Bank account with account number " + accountNum + " does not exist.");
        }
    }

    public static void removeCustomer(String ssn) {
        // İlgili işlemlerle müşteri silme
        
    }

    public static void displayAcc() {
        if (accounts.isEmpty()) {
            System.out.println("There are no bank accounts.");
        } else {
            System.out.println("Bank Accounts:");
            for (BankAccount account : accounts) {
                System.out.println(account.toString());
            }
        }
    }

    public static BankAccount searchAccount(String accountNum) {
        for (BankAccount account : accounts) {
            if (account.getAccountNum() == accountNum) {
                return account;
            }
        }
        return null;
    }

    public static void deleteAccount(String accountNum) {
        BankAccount account = searchAccount(accountNum);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Bank account with account number " + accountNum + " has been deleted.");
        } else {
            System.out.println("Bank account with account number " + accountNum + " does not exist.");
        }
    }

   /* public void calculateInterest() {
        for (BankAccount account : accounts) {
            account.calculateInterest();
        }
    }*/

    public static void calculateBalance() {
        for (BankAccount account : accounts) {
            account.calculatefinalBalance();
        }
    }

	public static Customer getCustomer(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
