package phase2;

import java.io.Serializable;


public class Order implements Serializable {
	
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
		if (headItem.getData() !=null && headItem.getData().getTitle().equalsIgnoreCase(title)) { 
	        headItem = headItem.getNext();
	        return true;
	    }
	
		Node priv = headItem ;
		Node current = headItem.getNext() ;
		while(current != null ){
			if( current.getData() != null && current.getData().getTitle().equalsIgnoreCase(title)) {
					priv.setNext( current.getNext());
					return true ; }
			
			else {
				priv = current;
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
      Node current = headItem;
      if( headItem == null) //checks if there are items
			return tpr ; 
      while (current != null) {
      current.getData().discount(pr);
      tpr += current.getData().getPrice();
      current = current.getNext();
      }
		return tpr;
	}
	
	public double addSpecialDiscountFiction() {
		double tpr = 0;
   Node current = headItem;
   if( headItem == null) //checks if there are items
			return tpr ; 

    // First loop: apply discounts
    while (current != null) {
        if (current.getData() instanceof Fiction) {
            ((Fiction) current.getData()).specialDiscount();
        }
        current = current.getNext();
    }

    // Second loop: calculate total price
    Node pointer = headItem; //create a new node to start collecting the price
    while (pointer != null) {
        tpr += pointer.getData().getPrice();
        pointer = pointer.getNext();
    }

    return tpr;

	}
	
	public double addSpecialDiscountNonFiction() {
		double tpr = 0;
   Node current = headItem;
   if( headItem == null) //checks if there are items
			return tpr ; 

    // First loop: apply discounts
    while (current != null) {
        if (current.getData() instanceof NonFiction) {
            ((NonFiction) current.getData()).specialDiscount();
        }
        current = current.getNext();
    }

    // Second loop: calculate total price
    Node pointer = headItem; //create a new node to start collecting the price
    while (pointer != null) {
        tpr += pointer.getData().getPrice();
        pointer = pointer.getNext();
    }

    return tpr;

	}
	
	public double addSpecialDiscountScience() {
		double tpr = 0;
   Node current = headItem;
   if( headItem == null) //checks if there are items
			return tpr ; 

    // First loop: apply discounts
    while (current != null) {
        if (current.getData() instanceof Science) {
            ((Science) current.getData()).specialDiscount();
        }
        current = current.getNext();
    }

    // Second loop: calculate total price
    Node pointer = headItem; //create a new node to start collecting the price
    while (pointer != null) {
        tpr += pointer.getData().getPrice();
        pointer = pointer.getNext();
    }

    return tpr;

	}
	
	public double addSpecialDiscountNovel() {
		double tpr = 0;
   Node current = headItem;
   if( headItem == null) //checks if there are items
			return tpr ; 

    // First loop: apply discounts
    while (current != null) {
        if (current.getData() instanceof Novel) {
            ((Novel) current.getData()).specialDiscount();
        }
        current = current.getNext();
    }

    // Second loop: calculate total price
    Node pointer = headItem; //create a new node to start collecting the price
    while (pointer != null) {
        tpr += pointer.getData().getPrice();
        pointer = pointer.getNext();
    }

    return tpr;
	}
	
	public double addSpecialDiscountShortStory() {
   double tpr = 0;
   Node current = headItem;
   if( headItem == null) //checks if there are items
			return tpr ; 

    // First loop: apply discounts
    while (current != null) {
        if (current.getData() instanceof ShortStory) {
            ((ShortStory) current.getData()).specialDiscount();
        }
        current = current.getNext();
    }

    // Second loop: calculate total price
    Node pointer = headItem; //create a new node to start collecting the price
    while (pointer != null) {
        tpr += pointer.getData().getPrice();
        pointer = pointer.getNext();
    }

    return tpr;
    
		}
	
	
    public String toString() {
		String str ="order name: " + name +"  customer's ID: " + ID + "  number of books: " + countBooks() ;
		str = str + "\n items in the order: \n";
         
         Node current = headItem;

        while (current != null) {
            str += current.getData().toString()+ "\n";
            current = current.getNext();
        }
			
		
		
		double totalPrice = 0.0;
		 Node pointer = headItem;
		
      while (pointer != null) {
            totalPrice +=  pointer.getData().getPrice();
            pointer =  pointer.getNext();
        }
		
		return str + String.format("Total Price: %.2f\n", totalPrice); 
	}

	
	
	


}
