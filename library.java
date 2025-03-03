package javaphase1;

public class library {
	public String name; //name of the library
	public String location; //the location of the library
	public int nob; //number of books in the array
	public int noo; //number of orders in the array 
	books inStore []; //array containing all the books in the library
	order ListOfOrders[]; //contains all orders
	
	public library(String n , String loc) {
		name = n;
		location = loc;
		inStore = new books[500];
		ListOfOrders = new order[999];
		nob = 0 ;
		noo = 0;
	}
	
	public boolean addBook (books b) { 
		if (nob < inStore.length) {
			inStore[nob ++] = b;
			return true;
		}
		return false;
		
	}
	
	public boolean addOrder(order o) {
		if(noo < ListOfOrders.length) {
			ListOfOrders[noo++] = o;
			return true;
		}
		return false;
	}
	
	
	public boolean removeOrder (String id) {
		for(int i = 0 ; i< noo; i++ ) {
			if (ListOfOrders[i].equals(id)) {
				ListOfOrders[i] = ListOfOrders[noo - 1];
				noo--;
				return true;
			}
		}
		return false;
	}
	
	public boolean searchOrder (String id) {
		for (int i = 0 ; i< noo; i++ ) {
			if (ListOfOrders[i].equals(id))
				return true;
		}
		return false;
	}
	
	
	
	public boolean addBook (books a) {
		if (nob < inStore.length) {
			inStore[nob] = new books(a); 
			nob++;
			return true;
		}
		return false;
	}
	
	public boolean removeBook(String title) {
		for (int i= 0; i < nob; i++) {
			if (inStore[i].title.equalsIgnoreCase(title)) {
				inStore[i] = inStore[nob-1];
				nob --;
				return true;
			}
		}
			return false;
		
	}
		
	public boolean searchBook(String title) {
		for (int i = 0; i <nob; i++) {
			if (inStore[i].title.equalsIgnoreCase(title))
				return true;
		}
		return false;
		
	}
	
	
	public String toString() {
		String str = "library's name: " +  name + " location:" + location;
		str = str + "/norders: /n" +ListOfOrders.toString();
		str = str + "/nall books available: /n" + inStore.toString();
		return str;
	}

	

}
