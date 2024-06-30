package Inheritance;


public class Beverage extends Aspava {

	private String size;
	
	public Beverage(double price, int quantity, int orderid,String size) {
		super(price, quantity, orderid);
		this.size = size;
		// TODO Auto-generated constructor stub
	}
	
	public String getSize() {
		return this.size;
	}
	
	public String toString() {
		return super.toString()+"\nSize= "+this.size+"\n";
	}

	@Override
	public void discount(int per) {
		// TODO Auto-generated method stub
		 setPrice(per*super.getPrice());
		
	}



}
