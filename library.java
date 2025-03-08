package javaphase1;

public class Library {
	public String name; //name of the library
	public String location; //the location of the library
	public int nob; //number of books in the array
	public int noo; //number of orders in the array 
	Books inStore []; //array containing all the books in the library
	Order ListOfOrders[]; //contains all orders
	
	public Library(String n , String loc, int maxOrders) {
		name = n;
		location = loc;
		inStore = new Books[500];
		ListOfOrders = new Order[maxOrders];
		nob = 0 ;
		noo = 0;
	}
	
	public boolean addBook (Books b) { 
		if (nob < inStore.length) {
			inStore[nob ++] = b;
			return true;
		}
		return false;
		
	}
	
	public boolean addOrder(Order o) {
		if(noo < ListOfOrders.length) {
			ListOfOrders[noo++] = o;
			return true;
		}
		return false;
	}
	
	
	public boolean removeOrder (String id) {
		for(int i = 0 ; i< noo; i++ ) {
			if (ListOfOrders[i].ID.equals(id)) {
				ListOfOrders[i] = ListOfOrders[noo - 1];
				ListOfOrders[noo - 1] = null;
				noo--;
				return true;
			}
		}
		return false;
	}
	
	public Order searchOrder (String id) {
		for (int i = 0 ; i< noo; i++ ) {
			if (ListOfOrders[i].ID.equals(id))
				return ListOfOrders[i];
		}
		return null;
	}
	
	
	public boolean removeBook(String title) {
		for (int i= 0; i < nob; i++) {
			if (inStore[i].title.equalsIgnoreCase(title)) {
				inStore[i] = inStore[nob-1];
				inStore[nob--] = null;
				return true;
			}
		}
			return false;
		
	}
		
	public Books searchBook(String title) {
		for (int i = 0; i <nob; i++) {
			if (inStore[i].title.equalsIgnoreCase(title))
				return inStore[i];
		}
		return null;
		
	}
	
	
	
	public String toString() {
		String str = "library's name: " +  name + " location:" + location;
		str = str + "/norders: /n" +ListOfOrders.toString();
		str = str + "/nall books available: /n" + inStore.toString();
		return str;
	}

	

}
