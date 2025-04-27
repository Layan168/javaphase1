package javaphase1;

public class Library {
	public String name; //name of the library
	public String location; //the location of the library
	public int nob; //number of books in the array
	public int noo; //number of orders in the array 
	Books inStore []; //array containing all the books in the library
	Order ListOfOrders[]; //contains all orders
   
   //we will add two new methods here, one for saving and one for loading
   //make sure books, order, and node were serializable
   
   /* public void savaAllInfo(){
 try{
File out = new File("books.dat");
FileOutputStream fos = new FileOutputStream (out);
ObjectOutputStream oos = new ObjectOutputStream (fos);
oos.writeObject( inStore ) ; // this will save all the books that were in the library
oos.close();
File out2 = new File("orders.dat");
FileOutputStream fos2 = new FileOutputStream (out2);
ObjectOutputStream oos2 = new ObjectOutputStream (fos2);
oos2.writeInt(numRes);
oos2.writeObject( ListOfOrders ) ; // saves all the orders with their linked list as well
oos2.close();
 } catch( IOException e){
 System.out.println(e.toString());
 }
}*/ 

/*public void readAllData(){ //unedited
 try{
File f = new File(fileOutput);
FileInputStream ff = new FileInputStream( f);
ObjectInputStream in= new ObjectInputStream(ff) ;

headRoom = (Node ) in.readObject();
in.close() ;
File f2 = new File("Reservations.dat");
FileInputStream ff2 = new FileInputStream( f2);
ObjectInputStream in2= new ObjectInputStream(ff2) ;
numRes = in2.readInt() ;
reservations = (Reservation[]) in2.readObject();
in2.close() ;
JOptionPane.showMessageDialog(null , "All data in files are loaded.");
} catch( ClassNotFoundException ex){ System.out.println(ex.toString()); }
catch( IOException e){ System.out.println(e.toString());}
}
}*/

//the rest of the methods here are supposed to be fine with no changes	
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
		
	public Books searchBook(String title) throws BookNotFoundException {
		for (int i = 0; i <nob; i++) {
			if (inStore[i].title.equalsIgnoreCase(title))
				return inStore[i];
		}
		throw new BookNotFoundException("the book doesn't exist");
		
	}
	
	
	
	public String toString() {
		String str = "library's name: " +  name + " location:" + location;
		str = str + "/norders: /n" +ListOfOrders.toString();
		str = str + "/nall books available: /n" + inStore.toString();
		return str;
	}

	

}
