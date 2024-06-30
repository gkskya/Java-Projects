package Inheritance;


public class Treat extends Aspava {
	
	private int quantityOfTreats;
	
	
	public Treat(double price,int q,int orderid,int quantityOfTreats) {
		super(price,q,orderid);
		this.quantityOfTreats = quantityOfTreats;
	}
	
	public int getQuantity() {
		return this.quantityOfTreats;
	}
	
	
	public String toString() {
		return super.toString()+"Quantity= "+this.quantityOfTreats+"\n";
	}

	@Override
	public void discount(int per) {
		setPrice(per*super.getPrice());
		// TODO Auto-generated method stub
		
	}

}
