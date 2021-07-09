package Models;

import java.util.ArrayList;

public class Production {
	private String NotTerminal;
	private ArrayList<String> products;
	
	
	public Production(String notTerminal, ArrayList<String> products) {
		NotTerminal = notTerminal;
		this.products = products;
	}


	public String getNotTerminal() {
		return NotTerminal;
	}


	public void setNotTerminal(String notTerminal) {
		NotTerminal = notTerminal;
	}


	public ArrayList<String> getProducts() {
		return products;
	}


	public void setProducts(ArrayList<String> products) {
		this.products = products;
	}
}
