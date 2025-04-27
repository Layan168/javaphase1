
package phase2;

public class Order {
	
	public String name; //customer's name
	public String ID; //customer's id    
	Node headItem; //first node in linked list for order items
	
	public Order (String n, String id) {
		name = n;
		ID = id;
		headItem = null;
	}
   
 
	public int countBooks(){ //counts the number of items in the order
		int count =0 ;
		if( headItem == null )
			return count ;
		
		else {Node current = headItem ;
			while(current != null ){
				count++ ;
				current = current.getNext();
			}
		}
			return count ;
		}
   
   
   
	
	public boolean addItem (Books a) { //composition
		
                               Node n =null;
		
	                    if (a instanceof Novel) {
                            n = new Node ( new Novel(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((Novel)a).getRecommendedAge()));
                             n.setNext(headItem);
                              headItem = n ; 
                              return true;}
	                      else if (a instanceof ShortStory) {
	                       n = new Node ( new ShortStory(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((ShortStory)a).getCountWord())); 
	 				
	                        n.setNext(headItem);
	                        headItem = n ; 
		            	return true;}
					 
				else if (a instanceof Science) {
					 n = new Node ( new Science(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((NonFiction)a).getEdition(),((NonFiction)a).getLanguage(), ((Science)a).getScientificField()));  
					 n.setNext(headItem);
		                headItem = n ; 
		            	return true;}
					
				else if (a instanceof NonFiction) {
					 n = new Node ( new NonFiction(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((NonFiction)a).getEdition(),((NonFiction)a).getLanguage())); 
					
					 n.setNext(headItem);
		                headItem = n ;
		            	return true;}
					
				else if (a instanceof Fiction) {
					 n = new Node ( new Fiction(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries())); 
					    
					    n.setNext(headItem);
		                headItem = n ;
		            	return true;}
				else 
					return false;
		
	}
	
	public boolean removeItem(String title) {
		if( headItem == null)
			return false ; 
		if (headItem.getData().getTitle().equalsIgnoreCase(title)) { 
	        headItem = headItem.getNext();
	        return true;
	    }
	
		Node priv = headItem ;
		Node current = headItem.getNext() ;
		while(current != null ){
			if( current.getData().getTitle().equalsIgnoreCase(title)) {
					priv.setNext( current.getNext());
					return true ; }
			
			else {
				priv = priv.getNext() ;
				current = current.getNext() ;
			}
		}
		return false;
		}

	
	public boolean searchItem(String title) {
		
         if (headItem == null)
    	 return false;

        Node current = headItem;
        while (current != null) {
        if (current.getData().getTitle().equalsIgnoreCase(title)) {   
        return true;}
        
        current = current.getNext();
        }
        return false;
        }
	
	
	
	public double addDiscount(int pr) {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) {
			if (orderItems[i] != null) {
			tpr = tpr + orderItems[i].discount(pr);
			
		}
      }
		return tpr;
	}
	
	public double addSpecialDiscountFiction() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof Fiction && !(orderItems[i] instanceof Novel) && !(orderItems[i] instanceof ShortStory)) {
				((Fiction)orderItems[i]).specialDiscount();
			}
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}
		
		return tpr;
	}
	
	public double addSpecialDiscountNonFiction() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof NonFiction && !(orderItems[i] instanceof Science) ) {
				((NonFiction)orderItems[i]).specialDiscount();
			}
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}
		
		return tpr;
	}
	
	public double addSpecialDiscountScience() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof Science) {
				((Science)orderItems[i]).specialDiscount();
			}
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}
		
		return tpr;
	}
	
	public double addSpecialDiscountNovel() {
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof Novel) {
				((Novel)orderItems[i]).specialDiscount();
			}
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}
		
		return tpr;
	}
	
	public double addSpecialDiscountShortStory() {
   /*Item current = head; // head of the linked list

    // First loop: apply discounts
    while (current != null) {
        if (current instanceof ShortStory) {
            ((ShortStory) current).specialDiscount();
        }
        current = current.next;
    }

    // Second loop: calculate total price
    current = head; // reset to start
    while (current != null) {
        totalPrice += current.price;
        current = current.next;
    }

    return totalPrice;*/
    
		double tpr = 0;
		for (int i = 0; i <numOfItems; i++) 
			if(orderItems[i] instanceof ShortStory) {
				((ShortStory)orderItems[i]).specialDiscount();
			}
				
		for (int j = 0; j <numOfItems; j++) {
			tpr = tpr + orderItems[j].price;
		}
		
		return tpr;
	}
	
	
	
	public String toString() {
		String str ="order name: " + name +"  customer's ID: " + ID + "  number of books: " + numOfItems ;
		str = str + "\n items in the order: \n";
		for (int i = 0; i< numOfItems; i++) {
			str = str + orderItems[i].toString();
			System.out.println();
         
         /*Node current = head;

        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += " -> ";
            }
            current = current.next;
        }*/
			
		}
		
		double totalPrice = 0.0;
		
		for (int i = 0; i< numOfItems; i++) {
			totalPrice = totalPrice + orderItems[i].getPrice();
			
		}
      /*while (current != null) {
            str += current.name + " ($" + String.format("%.2f", current.price) + ")\n";
            totalPrice += current.getPrice();
            current = current.next;
        }*/
		
		return str + String.format("Total Price: %.2f\n", totalPrice); 
	}
	
	
	

}
