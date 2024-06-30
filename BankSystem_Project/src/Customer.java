import java.util.Scanner;

// Customer.java
public class Customer extends Person {
    private String ssn;

    
    public Customer(String name, String lastName, String id, String address, String ssn) {
        super(name, lastName, id, address);
        this.ssn = ssn;
  
    }
 

  


	public String getSsn() {
        return ssn;
 
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name:");
        name = scanner.nextLine();

        System.out.println("Enter customer last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter customer ID:");
        id = scanner.nextLine();
        scanner.nextLine(); 

        System.out.println("Enter customer address:");
        address = scanner.nextLine();

        System.out.println("Enter customer SSN:");
        ssn = scanner.nextLine();
        scanner.nextLine(); 
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nSSN: " + ssn;
    }
	
}
