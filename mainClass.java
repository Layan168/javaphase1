package javaphase1;
import java. util. Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Science book1 = new Science("Chemistry For Dummies", "John T.Moore", "For Dummies", 19.99, 2016, 6, 2, "English", "Chemistry");
		Science book2 = new Science("The Universe in a Nutshell", "Stephen Hawking", "Bantam Books" , 35.00 , 2001, 5, 1,"Arabic", "Physics");
		Science book3 = new Science("The Hidden Life of Trees", "Peter Wohlleben", "Greystone Books", 24.95, 2016, 10, 1, "English", "Ecology" );
		
		Novel book4 = new Novel("Emma", "Jane Austen", "Penguin Classics", 25.00, 1815, 12, 474, "Comedy of Manners", "none", 14);
		Novel book5 = new Novel("Jane Eyre", "Charlotte Bronte", "Smith, Elder & Co.", 25.01, 1847,3, 500, "Gothic Fiction", "none", 14 );
		Novel book6 = new Novel("Scythe", "Neal Shusterman", "Simon & Schuster", 18.99, 2016, 6, 443, "Adventure", "Arc of a Scythe", 12);
		
		Fiction book7 = new Fiction("Brown Girl Dreaming", "Jacqueline Woodson", "penguin Group", 10.99, 2014, 8, 336, "Poetry", "none");
		Fiction book8 = new Fiction("The Little Price", "Antoine de Saint-Exupery", "Reynal & Hitchcock", 11.99, 1943, 20, 96, "Novella", "none");
		Fiction book9 = new Fiction("New Kid", "Jerry Craft", "HarperCollins", 12.99, 2019, 10, 256, "Graphic novel", "New Kid series" );
		
		ShortStory book10 = new ShortStory("The Lottery", "Shirley Jackson", "The New Yorker", 10.00, 1984, 4, 9, "Horror", "none", 3400);
		ShortStory book11 = new ShortStory("The Gift of the Magi", "O. Henry", "he New York Sunday World", 4.00, 1905, 6, 5, "Romance", "none", 2100);
		ShortStory book12 = new ShortStory("A Sound of Thunder" + "Ray Bradbury", "Collier’s", 13.09, 1952, 4, 15, "Thriller", "none", 4200);
		
		NonFiction book13 = new NonFiction("The Power of Habit", "Charles Duhigg", "Random House", 89.00, 2012, 9, 1,"English");
		NonFiction book14 = new NonFiction("Start with Why", "Simon Sinek","Portfolio", 103.24, 2008, 12, 1, "Arabic");
		NonFiction book15 = new NonFiction("The Wright Brothers", "David McCullough", "Simon & Schuster", 38.00, 2015, 23, 1, "English");
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
					
				System.out.println("Enter the book title to search");
				String titleToSearch=input.nextLine();
				 if (library1.searchBook(titleToSearch)) {
				        System.out.println("Success: The book with the title '" + titleToSearch + "' was found in the library.");
				    } else {
				        System.out.println("Sorry: No book found with the title '" + titleToSearch);
				    }
				break;
				
				
			case 3://* delete book 
					
			    System.out.println("Enter the book title to remove:");
			    String titleToRemove = input.nextLine(); 
			    if (library1.removeBook(titleToRemove)) {
                            System.out.println("The book with the title '" + titleToRemove + "' has been successfully removed.");
                            } 
			   else {
                           System.out.println("Sorry, no book found with the title '" + titleToRemove + "'.");
                              }
			    break;
				
			case 4://* show book list

                             System.out.println("List of books available in the library:");
				    if (library1.nob == 0) {
				        System.out.println("There are no books currently available in the library.");
				    } else {
				     System.out.println("Total number of books in the library: " + library1.nob);
				     for (int i = 0; i < library1.nob; i++) {
			             System.out.println("Book " + (i + 1) + ": " + library1.inStore[i]);
				        }
				    }
				    }

					
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
