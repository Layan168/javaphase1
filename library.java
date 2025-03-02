package javaphase1;

public class library {
	public String name; //name of the library
	public String location; //the location of the library
	public int numWorkers; //the number of workers 
	public int nob; //number of books in the array
	public int noo; //number of orders in the array 
	books inStore []; //array containing all the books in the library
	order ListOfOrders[];
	
	public library(String n , String loc) {
		name = n;
		location = loc;
		inStore = new books[500];
		ListOfOrders = new order[999];
		nob = 0 ;
		noo = 0;
	}
	
	public boolean addBook (books b) { //this is supposed to be able to take a book object(that we just created) and add it to the list of the books available in this specific library
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
	
	
	
	//an array with all the orders that were ever made
	/* methods that will be added later(not complete)
	add book
	add order
	remove order 
	remove book
	search
	
	*/

}
