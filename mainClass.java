package javaphase1;
import java. util. Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//12 books, non fiction, fiction, short stpry, novel, science (4 books)
		 
		 
		 
		 
		 //insert library name
		 
		 //menu loop
			//managing the library
			//* add book --> what type --> insert information
			//* search book --> title
			//* delete book --> title
			//* show book list --> list of books 

			
			//managing the orders
		 	//$ buy book(add order) --> name and id --> show list of books --> insert title --> order info
			//$ add discount --> order id --> discount percent --> show price after discount
			//$ add special discount --> order id --> apply discount for all items based on type --> show price after discont
			//__ search inside order --> book title --> is it there or not
			//__ search for an order ---> id 
			//__ delete order item --> name and id (check if there) --> show items in order --> insert book title --> show if book was actually deleted
			//__ delete order --> id --> deleted
			//$ show order list --> list of orders

			//exit system.exit(0);
			
		
		System.out.println("Enter library name:");
		String name = input.next();
		System.out.println("Enter the location: ");
		String location = input.next();
		System.out.println("Enter the amount of orders you will take");
		int maxOrders = input.nextInt();
		Library library1 = new Library(name, location, maxOrders);
		
		int ch =0;
		do {// main loop
			System.out.println("welcome to the main menu /n Enter a number to proceed");
			System.out.println("managing the library: ");
			System.out.println("1- add a book ");
			System.out.println("2- search for a book ");
			System.out.println("3- delete a book ");
			System.out.println("4- show all available books ");
			
			System.out.println(" ");
			System.out.println("managing the orders: ");
			System.out.println("5- buy a book ");
			System.out.println("6- add discount to an order ");
			System.out.println("7- add a special discount to an order ");
			System.out.println("8- search inside an order ");
			System.out.println("9- search for an order ");
			System.out.println("10- delete an item from an order ");
			System.out.println("11- delete an order ");
			System.out.println("12- show all orders ");
			System.out.println("13- exit ");
			
			ch = input.nextInt();
			switch(ch) {//main menu
			//for library
			case 1: //* add book
				
				break;
				
			case 2://* search book
				
				break;
				
			case 3://* delete book 
				
				break;
				
			case 4://* show book list
				
				break;
				
			//for orders
			case 5: //$ buy book(add order)
				
				break;
				
			case 6://$ add discount(nromal discout)
				
				break;
				
			case 7://$ add special discount
				
				break;
				
			case 8: //__ search inside order
				
				break;
				
			case 9: //__ search for an order
				
				break;
				
			case 10: //__ delete order item
			
				break;
			
			case 11: //__ delete order
				
				break;
			
			case 12: //$ show order list
				
				break;
				
			case 13: //exit
				System.out.println("Exiting the system...");
				System.out.println("See you next time");
				break;
			
				
				
			
			
			
			
			}//end of sweitch for main menu
			
			
		}while(ch != 13); //end of main loop
		 

	}

}
