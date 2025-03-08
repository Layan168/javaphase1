package javaphase1;

public class Order {
	public String name; //customer's name
	public String ID; //customer's id 
	Books orderItems[]; //array with the books the customer wants to purchase
	public int numOfItems; //number of books the order
	
	
	public Order (String n, String id, int size) {
		name = n;
		ID = id;
		orderItems = new Books [size];
		numOfItems = 0;
	}
	
	public boolean addItem (Books a) { 
		if (numOfItems < orderItems.length) {
			
				if (a instanceof Novel) {
					orderItems[numOfItems] = new Novel(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((Novel)a).getRecommendedAge());  
				    numOfItems++;}
				    
				else if (a instanceof ShortStory) {
					 orderItems[numOfItems] = new ShortStory(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((ShortStory)a).getCountWord()); 
					 numOfItems++;}
					 
				else if (a instanceof Science) {
					orderItems[numOfItems] = new Science(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((NonFiction)a).getEdition(),((NonFiction)a).getLanguage(), ((Science)a).getScientificField());  
					numOfItems++;}
					
				else if (a instanceof NonFiction) {
					orderItems[numOfItems] = new NonFiction(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((NonFiction)a).getEdition(),((NonFiction)a).getLanguage()); 
					numOfItems++;}
					
				else if (a instanceof Fiction) {
					    orderItems[numOfItems] = new Fiction(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries()); 
					    numOfItems++;}
					
			return true;
			}
			
		
		return false;
	}
	
	public boolean removeItem(String title) {
		for (int i= 0; i < numOfItems; i++) {
			if (orderItems[i].title.equalsIgnoreCase(title)) {
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
	
	public double addSpecialDiscountFiction() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof Fiction && !(orderItems[i] instanceof Novel) && !(orderItems[i] instanceof ShortStory)) {
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}}
		
		return tpr;
	}
	
	public double addSpecialDiscountNonFiction() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof NonFiction && !(orderItems[i] instanceof Science) ) {
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}}
		
		return tpr;
	}
	
	public double addSpecialDiscountScience() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof Science) {
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}}
		
		return tpr;
	}
	
	public double addSpecialDiscountNovel() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof Novel) {
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}}
		
		return tpr;
	}
	
	public double addSpecialDiscountShortStory() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof ShortStory) {
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}}
		
		return tpr;
	}
	
	
	
	public String toString() {
		String str ="order name: " + name +"  customer's ID: " + ID + "  number of books: " + numOfItems ;
		str = str + "\n items in the order: \n";
		for (int i = 0; i< numOfItems; i++) {
			str = str + orderItems[i].toString();
			System.out.println();
			
		}
		
		double totalPrice = 0.0;
		
		for (int i = 0; i< numOfItems; i++) {
			totalPrice = totalPrice + orderItems[i].getPrice();
			
		}
		
		return str + System.out.printf("Total Price: %.2f\n", totalPrice); 
		
	}
	
	
	

}
