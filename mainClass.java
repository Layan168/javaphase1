package javaphase1;
import java. util. Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Science book1 = new Science("Chemistry For Dummies", "John T.Moore", "For Dummies", 19.99, 2016, 6, 2023, "English", "Chemistry");
		Science book2 = new Science("The Universe in a Nutshell", "Stephen Hawking", "Bantam Books" , 35.00 , 2001, 5, 2001,"Arabic", "Physics");
		Science book3 = new Science("The Hidden Life of Trees", "Peter Wohlleben", "Greystone Books", 24.95, 2016, 10, 2018, "English", "Ecology" );
		
		Novel book4 = new Novel("Emma", "Jane Austen", "Penguin Classics", 25.00, 1815, 12, 474, "Comedy of Manners", "none", 14);
		Novel book5 = new Novel("Jane Eyre", "Charlotte Bronte", "Smith, Elder & Co.", 25.01, 1847,3, 500, "Gothic Fiction", "none", 14 );
		Novel book6 = new Novel("Scythe", "Neal Shusterman", "Simon & Schuster", 18.99, 2016, 6, 443, "Adventure", "Arc of a Scythe", 12);
		
		Fiction book7 = new Fiction("Brown Girl Dreaming", "Jacqueline Woodson", "penguin Group", 10.99, 2014, 8, 336, "Poetry", "none");
		Fiction book8 = new Fiction("The Little Price", "Antoine de Saint-Exupery", "Reynal & Hitchcock", 11.99, 1943, 20, 96, "Novella", "none");
		Fiction book9 = new Fiction("New Kid", "Jerry Craft", "HarperCollins", 12.99, 2019, 10, 256, "Graphic novel", "New Kid series" );
		
		ShortStory book10 = new ShortStory("The Lottery", "Shirley Jackson", "The New Yorker", 10.00, 1984, 4, 9, "Horror", "none", 3400);
		ShortStory book11 = new ShortStory("The Gift of the Magi", "O. Henry", "he New York Sunday World", 4.00, 1905, 6, 5, "Romance", "none", 2100);
		ShortStory book12 = new ShortStory("A Sound of Thunder" , "Ray Bradbury", "Collier’s", 13.09, 1952, 4, 15, "Thriller", "none", 4200);
		
		NonFiction book13 = new NonFiction("The Power of Habit", "Charles Duhigg", "Random House", 89.00, 2012, 9, 2024,"English");
		NonFiction book14 = new NonFiction("Start with Why", "Simon Sinek","Portfolio", 103.24, 2008, 12, 2016, "Arabic");
		NonFiction book15 = new NonFiction("The Wright Brothers", "David McCullough", "Simon & Schuster", 38.00, 2015, 23, 2017, "English");
		Library library1 = new Library("Reader's corner", "Riyadh", 999);
		
		library1.addBook(book1);
		library1.addBook(book2);
		library1.addBook(book3);
		library1.addBook(book4);
		library1.addBook(book5);
		library1.addBook(book6);
		library1.addBook(book7);
		library1.addBook(book8);
		library1.addBook(book9);
		library1.addBook(book10);
		library1.addBook(book11);
		library1.addBook(book12);
		library1.addBook(book13);
		library1.addBook(book14);
		library1.addBook(book15);
		 
		 
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
			System.out.println("6- add a book to an order");
			System.out.println("7- add discount to an order ");
			System.out.println("8- add a special discount to an order ");
			System.out.println("9- search inside an order ");
			System.out.println("10- search for an order ");
			System.out.println("11- delete an item from an order ");
			System.out.println("12- delete an order ");
			System.out.println("13- show all orders ");
			System.out.println("14- exit ");
			
			ch = input.nextInt();
			switch(ch) {//main menu
					
			//for library
			case 1: //* add book
                          
    System.out.println("Enter the type of book you want to add: ");
    System.out.println("1- Science Book");
    System.out.println("2- Novel");
    System.out.println("3- Fiction");
    System.out.println("4- Short Story");
    System.out.println("5- Non-Fiction");
    
    int bookType = input.nextInt();
    
    String title, author, publisher, language;
    double price;
    int year, pages, orderId;

    // Ask for common book details
    System.out.println("Enter the title of the book:");
    title = input.nextLine();
    System.out.println("Enter the author of the book:");
    author = input.nextLine();
    System.out.println("Enter the publisher of the book:");
    publisher = input.nextLine();
    System.out.println("Enter the price of the book:");
    price = input.nextDouble();
    System.out.println("Enter the publication year:");
    year = input.nextInt();
    System.out.println("Enter the number of pages:");
    pages = input.nextInt();
    input.nextLine();  
    System.out.println("Enter the language of the book:");
    language = input.nextLine();
    
    switch (bookType) {
        case 1:  // Adding a Science book
            System.out.println("Enter the scientific field:");
            String scientificField = input.nextLine();
            Science newScienceBook = new Science(title, author, publisher, price, year, noc, 2025, language, scientificField);
            library1.addBook(newScienceBook);
            System.out.println("Science book has been added successfully!");
            break;
        
        case 2:  // Adding a Novel
            System.out.println("Enter the genre of the novel:");
            String genre = input.nextLine();
            System.out.println("Enter the novel series:");
            String series = input.nextLine();
            System.out.println("Enter the number of pages:");
            int page = input.nextInt();
            Novel newNovel = new Novel(title, author, publisher, price, year, pages, page, genre, series);
            library1.addBook(newNovel);
            System.out.println("Novel has been added successfully!");
            break;

        case 3:  // Adding a Fiction book
            System.out.println("Enter the genre of the fiction book:");
            String fictionGenre = input.nextLine();
            System.out.println("Enter the series:");
            String fictionSeries = input.nextLine();
            Fiction newFictionBook = new Fiction(title, author, publisher, price, year, pages,  fictionGenre, fictionSeries);
            library1.addBook(newFictionBook);
            System.out.println("Fiction book has been added successfully!");
            break;
        
        case 4:  // Adding a Short Story
            System.out.println("Enter the genre of the short story:");
            String shortStoryGenre = input.nextLine();
            System.out.println("Enter the number of words in the story:");
            int wordCount = input.nextInt();
            ShortStory newShortStory = new ShortStory(title, author, publisher, price, year, pages, wordCount, shortStoryGenre, wordCount);
            library1.addBook(newShortStory);
            System.out.println("Short story has been added successfully!");
            break;
        
        case 5:  // Adding a Non-Fiction book
            NonFiction newNonFictionBook = new NonFiction(title, author, publisher, price, year, pages, 2025, language);
            library1.addBook(newNonFictionBook);
            System.out.println("Non-Fiction book has been added successfully!");
            break;
        
        default:
            System.out.println("Invalid option selected for book type.");
    }
    break;


					
				break;
				
			case 2://* search book
					
				System.out.println("Enter the book title to search");
				String titleToSearch=input.nextLine();
				library1.searchBook(titleToSearch);
				if(library1.searchBook(titleToSearch) == null)
				System.out.println("book is not in the system");      
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
				    

					
				break;
				
			 //for orders
			 case 5: //$ buy book(add order)
				 
				 System.out.println("to make new order");
				 System.out.println("enter the number of books the customer wants to purchase");
				 int size = input.nextInt();

				 System.out.println("enter customer name");
				 String nm = input.nextLine();
          
        
				 System.out.println("enter customer id");
				 int id = input.nextInt();
				 
				 Order custOrder = (Order) new Order(nm,id,size);
				 String bookt;
				 do {
				 System.out.println("enter book title");
				 System.out.println("type stop to stop adding");
				 bookt = input.next();
				 if(custOrder.addItem(library1.searchBook(bookt)))
					 System.out.println("book was added");
				 else
					 System.out.println("book was not added");
				 
				 }while(bookt != "stop");

				break;
				
			 case 6: //(add a book to an already existing order
				System.out.println("enter order id");
				 String cusid = input.next();
				 System.out.println("enter the title of the book");
				 String T =  input.next();
				 if(library1.searchOrder(cusid).addItem(library1.searchBook(T)))
					 System.out.println("book was added");
				 else
					 System.out.println("book was not added"); 
				 
				 break;
				
			case 7://$ add discount(normal discount)
			System.out.println("enter the percent of the discount");
			int  d= input.nextInt();
			System.out.println("enter the order ID");
			String cusID = input.next();
			
			library1.searchOrder(cusID);
			System.out.println("price after discount: ");
			library1.searchOrder(cusID).addDiscount(d);
				break;
				
				
			case 8://$ add special discount
				System.out.println("enter the order ID");
				String custID = input.next();
				
				library1.searchOrder(custID);
				System.out.println("price after special discount: ");
				library1.searchOrder(custID).addSpecialDiscount();
				break;

          
				
			case 9: //__ search inside order
				System.out.println("enter the order ID");
				String orID = input.next();
				System.out.println("enter the title of the book");
				String t = input.next();
				library1.searchOrder(orID);
				if(library1.searchOrder(orID).searchItem(t))
					System.out.println("book is in the order");
				else
					System.out.println("book is not in the order");
				
				break;
				
			case 10: //__ search for an order
				System.out.println("enter the order ID");
				String ordID = input.next();
				if (library1.searchOrder(ordID) == null) 
					System.out.println("there is not order with such id");
				else {
					System.out.println("the order with the id:");
					System.out.println(library1.searchOrder(ordID));
				}
				break;
				
			case 11: //__ delete order item
				System.out.println("enter the order ID");
				String orderID = input.next();
				System.out.println("enter the title of the book to remove: ");
				String ti = input.next();
				if(library1.searchOrder(orderID).removeItem(ti))
					System.out.println("book is removed from order");
				else
					System.out.println("book wasn't removed");
				break;
			
			case 12: //__ delete order
				System.out.println("enter the order ID");
				String OrdID = input.next();
				if(library1.removeOrder(OrdID))
					System.out.println("order has bee removed");
				else
					System.out.println("order wasn't removed");
				
				break;
			
			case 13: //$ show order list
				System.out.println("list of all orders: ");
				library1.ListOfOrders.toString();
				
				break;
				
			case 14: //exit
				System.out.println("Exiting the system...");
				System.out.println("See you next time");
				break;
			
				
				
			
			
			
			
			}//end of switch for main menu
			
			
		}while(ch != 14); //end of main loop
		 

	}

}
