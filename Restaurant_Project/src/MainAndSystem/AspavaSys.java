package MainAndSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import HasA.Customer;
import Inheritance.Aspava;
import Inheritance.Beverage;
import Inheritance.Food;

public class AspavaSys {
	private static ArrayList<Aspava> aspavaL = new ArrayList<Aspava>();
	
	public static ArrayList<Aspava> getAspavaList() {
		return aspavaL;
	}
	
	public static void readFromFile() {
		try {
			Scanner inp = new Scanner(new File("Aspava.txt"));
			Aspava item ;
			double price;
			int q,orderid,portion;
			String size,name,type;
			while(inp.hasNext()) {
				type = inp.next();
				switch(type) {
				case "Food":
					price = inp.nextDouble();
					q = inp.nextInt();
					portion = inp.nextInt();
					orderid = inp.nextInt();
					name = inp.nextLine();
					item = new Food(price,q,orderid,portion);
						if(orderid<200)
							item.discount(0.10);
					aspavaL.add(item);
					break;
				case "Beverage":
					price = inp.nextDouble();
					q = inp.nextInt();
					size = inp.next();
					orderid = inp.nextInt();
					name = inp.nextLine();
					item = new Beverage(price,q,orderid,size);
					aspavaL.add(item);
					break;
				}
			}
			inp.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void addItem(String deliveryType, String nameSurname) {
		
		Aspava temp = null;
		
		String ch= "";
		do {
			temp.getInput();
			aspavaL.add(temp);
		}while(ch.equalsIgnoreCase("no"));
		
		
		
	}

	public static String addCustomer() {
		int i;
		String res = "";
		Customer temp = new Customer();
		for (i=0;i< aspavaL.size();i++) {
			temp.getInput();
			res += temp.toString();
		}
		
		return res;
	}
	
	public static Aspava deleteItem(int id) {
		int i;
		Aspava found = null;
		for(i=0;i<aspavaL.size();i++) {
			if(aspavaL.get(i).getOrderId() == id) {
				found = aspavaL.get(i);
				aspavaL.remove(i);
			}
		}
		return found;
	}

	public static Aspava findItem(int id) {
		int i;
		String res = "";
		Aspava found = null;
		for(i=0;i<aspavaL.size();i++) {
			if(aspavaL.get(i).getOrderId() == id) {
				res +=aspavaL.get(i).toString();
				found = aspavaL.get(i);
			}
		}
		System.out.println("Searched Item\n"+res);
		return found;
	}
	
	public static String getAspavaString(String type) {
		
		String result = "";
		Aspava Aspava;
		
		for (int i = 0; i < aspavaL.size(); i++) {
			Aspava = aspavaL.get(i);
			
			if (type.equalsIgnoreCase("f") && Aspava instanceof Food) {
				result += ((Food)Aspava).toString() + "\n";
			} else if (type.equalsIgnoreCase("b") && Aspava instanceof Beverage) {
				result += ((Beverage)Aspava).toString() + "\n";
			}
		}
		
		return result;
	}

	public static String display() {
		String res = "";
		for (int i=0;i<aspavaL.size();i++) {
			res += aspavaL.get(i).toString()+"\n";
		}
		
		return res;
	}

	public static void writeToFile() {
		try {
			PrintWriter pw = new PrintWriter(new File("finaspavaLReceipt.txt"));
			for (int i = 0 ; i<aspavaL.size();i++) {
				pw.print(aspavaL.get(i).toString());
				
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
