package javaphase1;

public class Order {
	public String name; //customer's name
	public String ID; //customer's id 
	Books orderItems[]; //array with the books the customer wants to purchase
	public int numOfItems; //number of books the order
   //new node headbooks
	
	//create a method to store all orders into file + read orders from file + make it node
	public Order (String n, String id, int size) {
		name = n;
		ID = id;
		orderItems = new Books [size];
		numOfItems = 0;
      //add the node object and make it null 
	}
   
   /* create method count to count the objects in the linked list
   public int countBooks(){
   if( headRoom == null )
   return 0 ;
   int count =0 ;
   Node current = headRoom ;
   while(current != null ){
   count++ ;
   current = current.getNext();
   }
   return count ;
   }
   
   
   */
	
	public boolean addItem (Books a) { //composition
   //create a node n;
		if (numOfItems < orderItems.length) {
			// checking for space is no longer needed
				if (a instanceof Novel) {
					orderItems[numOfItems] = new Novel(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((Novel)a).getRecommendedAge());  
				    numOfItems++;}
				    // n = new node ( new Novel(a.getTitle(), a.getAuthor(), a.getPublisher(), a.getPrice(), a.getYear(), ((Fiction)a).getNumOfpages(), ((Fiction)a).getGenre(), ((Fiction)a).getSeries(), ((Novel)a).getRecommendedAge());
                //if it doesn't work, create a copy constructor
                //n.setNext(headBooks);
                //headBooks = n ; 
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
   //if( headBooks == null)
   //return false ; 
   /*if(headRoom.getData().getRoomNo() == no ) {
Room temp = headRoom.getData();
if( temp.isAvailable() == false ){
JOptionPane.showMessageDialog(null,"this room is reserved already now by
other person");
return false;
}
headRoom = headRoom.getNext();
return true ;
}
Node priv = headRoom ;
Node current = headRoom.getNext() ;
while(current != null ){
if( current.getData().getRoomNo()== no ) {
 if(current.getData().isAvailable() == true ){
priv.setNext( current.getNext());
return true ; }
 else
JOptionPane.showMessageDialog(null,"this room is reserved already now by
other person");
return false;
}
else {
priv = priv.getNext() ;
current = current.getNext() ;
}
}*/
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
   /*public Room searchRoom(int no ){
 if( headRoom == null )
 return null ;

Node current = headRoom ;
while(current != null )
{
if( current.getData().getRoomNo() == no )
return current.getData() ;
current = current.getNext();
}
return null ; // if not found
}*/
		for (int i = 0; i <numOfItems; i++) {
			if (orderItems[i].title.equalsIgnoreCase(title))
				return true;
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
		
		return str + System.out.printf("Total Price: %.2f\n", totalPrice); 
		//String.format("Total Price: %.2f\n", totalPrice); instead of printf
	}
	
	
	

}
