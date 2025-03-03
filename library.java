package javaphase1;

public class order {
	public String name; //customer's name
	public int ID; //customer's id 
	books orderItems[]; //array with the books the customer wants to purchase
	public int numOfItems; //number of books the order
	public double actualPrice; //the price of all the books
	
	public order (String n, int id, int size) {
		name = n;
		ID = id;
		orderItems = new books [size];
		numOfItems = 0;
	}
	
	public boolean addItem (books a) { //check if this is the right way to add up the price
		if (numOfItems < orderItems.length) {
			if (a.getNoc() >0) {
			orderItems[numOfItems] = new books(a); //composition but it doesn't work!
			numOfItems++;
			actualPrice += a.price;
			a.setNoc() = a.getNoc() - 1;
			return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean removeItem(String title) {
		for (int i= 0; i < numOfItems; i++) {//make sure equalsIgnoreCase is the right one
			if (orderItems[i].title.equalsIgnoreCase(title)) {
				actualPrice -= orderItems[i].price;
				orderItems[i].setNoc() = a.getNoc() +1;
				orderItems[i] = orderItems[numOfItems-1];
				numOfItems --;
				
				return true;
			}
		}
			return false;
		
	}
		
	public boolean searchItem(String title) {
		for (int i = 0; i <numOfItems; i++) {
			if (orderItems[i].title.equalsIgnoreCase(title))
				return true;
		}
		return false;
		
	}
	
	public String toString() {
		String str =" order name: " + name +"  customer's ID: " + ID + "  number of books: " + numOfItems+ "  total pricae: " + actualPrice;
		str = str + "/n items in the order: /n";
		for (int i = 0; i< numOfItems; i++) {
			str = str + orderItems[i].toString();
			System.out.println();
			
		}
		return str;
		
	}
		

}
