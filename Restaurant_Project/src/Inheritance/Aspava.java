package Inheritance;

import java.util.Scanner;

import HasA.Customer;
import InterfaceDiscount.Discount;

public abstract class Aspava implements Discount{
	protected double price;
	protected int quantity;
	protected int orderId;
	protected static int numOfOrders = 0;
	protected Customer cus = new Customer();
	
	
	public Aspava(double price,int quantity,int orderid) {
		this.price = price;
		this.quantity = quantity;
		this.orderId = orderid;
		
		numOfOrders++;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
	public void getInput() {
		Scanner inp = new Scanner(System.in);
		cus.getInput();
		System.out.println("Enter price : ");
		this.price = inp.nextDouble();
		System.out.println("Enter Quantity : ");
		this.quantity = inp.nextInt();
		System.out.println("Enter orderId : ");
		this.orderId = inp.nextInt();
		
		
		inp.close();
	}
	
	
	public void discount(double d) {
			double TotalPrice = this.quantity * this.price;
		if (TotalPrice > 100.0)
			this.setPrice(price * d);
	}
	
	
	public String toString() {
		return "Price= "+this.price+"\nQuantity= "+this.quantity+"\nOrder Id= "+this.orderId+"\n"+cus.toString()+"\n";
	}

	
	
}
