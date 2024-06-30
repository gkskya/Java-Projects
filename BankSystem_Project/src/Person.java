// Person.java
public class Person {
    protected String name;
    protected String lastName;
    protected String id;
    protected String address;
   // protected BankAccount bankAccount;

    public Person(String name, String lastName, String id, String address) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    
   /* public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
*/
    @Override
    public String toString() {
        String personInfo = "Name: " + name +
                            "\nLast Name: " + lastName +
                            "\nID: " + id +
                            "\nAddress: " + address;

        

        return personInfo;
    }
}
