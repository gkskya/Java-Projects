package Inheritance;


public class Food extends Aspava {
	private int portion;
	
	
	public Food(double price,int q,int orderid,int portion) {
		super(price,q,orderid);
		this.portion = portion;
	}
	
	public int getPortion() {
		return this.portion;
	}
	
	
	public String toString() {
		return super.toString()+"Portion= "+this.portion+"\n";
	}

	@Override
	public void discount(int per) {
		setPrice(per*super.getPrice());
		// TODO Auto-generated method stub
		
	}


	
}
