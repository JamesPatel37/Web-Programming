package cs320.beans;

import java.util.ArrayList;

public class ShoppingCartBean {

	private ArrayList<CartItemBean> items;

	public ShoppingCartBean() {
		items = new ArrayList<CartItemBean>();
		items.add(new CartItemBean("Pebble Watch", 199.99, 1));
		items.add(new CartItemBean("Auto-Lacing Nike Shoes", 500, 2));
		items.add(new CartItemBean("Beats Studio Headphones", 349, 1));
	}

	public ArrayList<CartItemBean> getItems() {
		return items;
	}
	
	public int getNumberOfItems(){
		return items.size();
	}
	
	public boolean isNotEmpty(){
		return items.size() > 0;
	}
	
	
	
	
	
}
