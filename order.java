package javaphase1;

public class Order {
	public String name; //customer's name
	public int ID; //customer's id 
	Books orderItems[]; //array with the books the customer wants to purchase
	public int numOfItems; //number of books the order
	
	
	public Order (String n, int id, int size) {
		name = n;
		ID = id;
		orderItems = new Books [size];
		numOfItems = 0;
	}
	
	public boolean addItem (Books a) { 
		if (numOfItems < orderItems.length) {
			if (a.getNoc() >0) {
				if (a instanceof Novel)
					orderItems[numOfItems] = new Novel(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), a.getNoc(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((Novel)a).getRecommendedAge());  
				    numOfItems++;
				    a.setNoc(a.getNoc() - 1);
				 if (a instanceof ShortStory)
					 orderItems[numOfItems] = new ShortStory(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), a.getNoc(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((ShortStory)a).getCountWord()); 
					 numOfItems++;
					 a.setNoc(a.getNoc() - 1);
				if (a instanceof Science)
					orderItems[numOfItems] = new Science(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), a.getNoc(), ((NonFiction)a).getEdition(),((NonFiction)a).getLanguage(), ((Science)a).getScientificField());  
					numOfItems++;
					a.setNoc(a.getNoc() - 1);
				if (a instanceof NonFiction)
					orderItems[numOfItems] = new NonFiction(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), a.getNoc(), ((NonFiction)a).getEdition(),((NonFiction)a).getLanguage()); 
					numOfItems++;
					a.setNoc(a.getNoc() - 1);
				if (a instanceof Fiction)
					orderItems[numOfItems] = new Fiction(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), a.getNoc(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries()); 
					numOfItems++;
					a.setNoc(a.getNoc() - 1);
			return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean removeItem(String title) {
		for (int i= 0; i < numOfItems; i++) {//make sure equalsIgnoreCase is the right one
			if (orderItems[i].title.equalsIgnoreCase(title)) {
				orderItems[i].setNoc(orderItems[i].getNoc() +1);
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
	
	public double addDiscount(int pr) {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) {
			tpr = tpr + orderItems[i].discount(pr);
			
		}
		return tpr;
	}
	
	public double addSpecialDiscount() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) {
			tpr = tpr + orderItems[i].specialDiscount();
		}
		
		return tpr;
	}
	
	public String toString() {
		String str =" order name: " + name +"  customer's ID: " + ID + "  number of books: " + numOfItems ;
		str = str + "/n items in the order: /n";
		for (int i = 0; i< numOfItems; i++) {
			str = str + orderItems[i].toString();
			System.out.println();
			
		}
		
		double totalPrice = 0.0;
		str = str + "/n total price: ";
		for (int i = 0; i< numOfItems; i++) {
			totalPrice = totalPrice + orderItems[i].getPrice();
			
		}
		
		return str + totalPrice; 
		
	}
	
	
	

}
