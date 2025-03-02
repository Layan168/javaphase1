package javaphase1;

public class order {
	public String name; //customer's name
	public int ID; //customer's id (will be used in search method in library class)
	books orderItems[]; //array with the books the customer wants to purchase
	public int numOfItems; //number of books the order
	public double actualPrice; //the price of all the books
	
	public order (String n, int id, int noi) {
		name = n;
		ID = id;
		numOfItems = noi;
	}
	
	public order(order o) {
		name = o.name;
		ID = o.ID;
		numOfItems = o.numOfItems;
		
	}
	
	//add item, remove item, search for an item, 
	
	
	
	

}
