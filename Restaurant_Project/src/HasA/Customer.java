package HasA;

import java.util.Scanner;

public class Customer {
	private String deliveryType;
	private String nameSurname;
	
	public Customer() {
		//No-arg constructor
	}
	
	public Customer(String dt,String ns) {
		this.deliveryType = dt;
		this.nameSurname = ns;
	}
	
	public void getInput() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter delivery Type : ");
		this.deliveryType = inp.next();
		System.out.println("Enter name & surnamr : ");
		this.nameSurname = inp.next();
		
	}

	@Override
	public String toString() {
		return "Customer\nDeliveryType= " + this.deliveryType + "\nNameSurname= " + nameSurname + "\n";
	}
	
}
