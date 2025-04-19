package javaphase1;
import java. util. Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Science book1 = new Science("Chemistry For Dummies", "John T.Moore", "For Dummies", 19.99, 2016, 2023, "English", "Chemistry");
		Science book2 = new Science("The Universe in a Nutshell", "Stephen Hawking", "Bantam Books" , 35.00 , 2001,  2001,"Arabic", "Physics");
		Science book3 = new Science("The Hidden Life of Trees", "Peter Wohlleben", "Greystone Books", 24.95, 2016,  2018, "English", "Ecology" );
		
		Novel book4 = new Novel("Emma", "Jane Austen", "Penguin Classics", 25.00, 1815, 474, "Comedy of Manners", "none", 14);
		Novel book5 = new Novel("Jane Eyre", "Charlotte Bronte", "Smith, Elder & Co.", 25.01, 1847, 500, "Gothic Fiction", "none", 14 );
		Novel book6 = new Novel("Scythe", "Neal Shusterman", "Simon & Schuster", 18.99, 2016, 443, "Adventure", "Arc of a Scythe", 12);
		
		Fiction book7 = new Fiction("Brown Girl Dreaming", "Jacqueline Woodson", "penguin Group", 10.99, 2014, 336, "Poetry", "none");
		Fiction book8 = new Fiction("The Little Price", "Antoine de Saint-Exupery", "Reynal & Hitchcock", 11.99, 1943, 96, "Novella", "none");
		Fiction book9 = new Fiction("New Kid", "Jerry Craft", "HarperCollins", 12.99, 2019, 256, "Graphic novel", "New Kid series" );
		
		ShortStory book10 = new ShortStory("The Lottery", "Shirley Jackson", "The New Yorker", 10.00, 1984, 9, "Horror", "none", 3400);
		ShortStory book11 = new ShortStory("The Gift of the Magi", "O. Henry", "he New York Sunday World", 4.00, 1905, 5, "Romance", "none", 2100);
		ShortStory book12 = new ShortStory("A Sound of Thunder" , "Ray Bradbury", "Collier’s", 13.09, 1952, 15, "Thriller", "none", 4200);
		
		NonFiction book13 = new NonFiction("The Power of Habit", "Charles Duhigg", "Random House", 89.00, 2012, 2024,"English");
		NonFiction book14 = new NonFiction("Start with Why", "Simon Sinek","Portfolio", 103.24, 2008, 2016, "Arabic");
		NonFiction book15 = new NonFiction("The Wright Brothers", "David McCullough", "Simon & Schuster", 38.00, 2015, 2017, "English");
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
	
		
		int ch =0;
		do {// main loop
			try {
			System.out.println("welcome to the main menu"); 
			System.out.println("Enter a number to proceed");
			System.out.println("managing the library: ");
			System.out.println("1- add a book ");
			System.out.println("2- search for a book ");
			System.out.println("3- delete a book ");
			System.out.println("4- show all available books ");
			
			System.out.println(" ");
			System.out.println("managing the orders: ");
			System.out.println("5- make an order");
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
			input.nextLine();
			
			switch(ch) {//main menu
			//for library
			case 1: //* add book
				System.out.println("Enter the type of book you want to add: ");
			    System.out.println("1- Science Book");
			    System.out.println("2- Novel");
			    System.out.println("3- Fiction");
			    System.out.println("4- Short Story");
			    System.out.println("5- Non-Fiction");
			    System.out.println("6- Exit");
			    
			    int bookType = input.nextInt();
			    input.nextLine();
			    
			    if(bookType == 6) {
			    	System.out.println("back to the main menu");
			    	break;}
			    
			    String title, author, publisher, language;
			    double price;
			    int year, pages, yearOfEdition;
			   

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
			    input.nextLine(); 
			    
			    switch (bookType) {
			        case 1:  // Adding a Science book
			        	System.out.println("enter the year of edition:");
			        	yearOfEdition = input.nextInt();
			        	input.nextLine();
			        	System.out.println("Enter the language of the book:");
					    language = input.nextLine();
			            System.out.println("Enter the scientific field:");
			            String scientificField = input.nextLine();
			            Science newScienceBook = new Science(title, author, publisher, price, year, yearOfEdition, language, scientificField);
			            library1.addBook(newScienceBook);
			            System.out.println("Science book has been added successfully!");
			            break;
			        
			        case 2:  // Adding a Novel
			            System.out.println("Enter the genre of the novel:");
			            String genre = input.nextLine();
			            System.out.println("Enter the novel series or type none:");
			            String series = input.nextLine();
			            System.out.println("Enter the number of pages:");
			            pages = input.nextInt();
			            System.out.println("Enter the recommended age:");
			            int recommendedAge = input.nextInt();
			            Novel newNovel = new Novel(title, author, publisher, price, year, pages, genre, series, recommendedAge);
			            library1.addBook(newNovel);
			            System.out.println("Novel has been added successfully!");
			            break;

			        case 3:  // Adding a Fiction book
			            System.out.println("Enter the genre of the fiction book:");
			            String fictionGenre = input.nextLine();
			            System.out.println("Enter the series or type none:");
			            String fictionSeries = input.nextLine();
			            System.out.println("Enter the number of pages:");
			            pages = input.nextInt();
			            Fiction newFictionBook = new Fiction(title, author, publisher, price, year, pages,  fictionGenre, fictionSeries);
			            library1.addBook(newFictionBook);
			            System.out.println("Fiction book has been added successfully!");
			            break;
			        
			        case 4:  // Adding a Short Story
			            System.out.println("Enter the genre of the short story:");
			            String shortStoryGenre = input.nextLine();
			            System.out.println("Enter the series or type none:");
			            String shortStorySeries = input.nextLine();
			            System.out.println("Enter the number of words in the story:");
			            int wordCount = input.nextInt();
			            System.out.println("Enter the number of pages")	;
			            pages = input.nextInt();
			            ShortStory newShortStory = new ShortStory(title, author, publisher, price, year, pages,shortStoryGenre,shortStorySeries, wordCount);
			            library1.addBook(newShortStory);
			            System.out.println("Short story has been added successfully!");
			            break;
			        
			        case 5:  // Adding a Non-Fiction book
			        	System.out.println("enter the year of edition:");
			        	yearOfEdition = input.nextInt();
			        	input.nextLine();
			        	System.out.println("Enter the language of the book:");
					    language = input.nextLine();
			            NonFiction newNonFictionBook = new NonFiction(title, author, publisher, price, year, yearOfEdition, language);
			            library1.addBook(newNonFictionBook);
			            System.out.println("Non-Fiction book has been added successfully!");
			            break;
			        
			        
			        default:
			            System.out.println("Invalid option selected for book type.");
			    }


					
				break;
				
			case 2://* search book
					
				System.out.println("Enter the book title to search");
				String titleToSearch=input.nextLine();
				
            try{
            
				if(library1.searchBook(titleToSearch) != null)
				System.out.println("book is in the system"); 
            }
				catch (BookNotFoundException e) {
               System.out.println("Book is not in the system");
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
				    

					
				break;
				
			 //for orders
			 case 5: //$ buy book(add order)
				 
				 System.out.println("to make new order");
				 System.out.println("enter the number of books the customer wants to purchase");
				 int size = input.nextInt();
				 input.nextLine();
				 
				 System.out.println("enter customer name");
				 String nm = input.next();
				 input.nextLine();
        
				 System.out.println("enter customer id");
				 String id = input.next();
				 input.nextLine();
				 
				 Order custOrder = new Order(nm,id,size);
				 library1.addOrder(custOrder);
				 String bookt;
				 
				 do {
				 System.out.println("enter book title");
				 System.out.println("or type stop to stop adding");
				 bookt = input.nextLine(); 
				 
				 
				 
				 if(bookt.equals("stop"))
					 break;
				  try {
        Books book = library1.searchBook(bookt); // only call once

        if (library1.searchOrder(id) != null) {
            custOrder.addItem(book);
            System.out.println("Book was added");
        } else {
            System.out.println("Order does not exist");
        }

    } catch (BookNotFoundException e) {
        System.out.println("Book does not exist");
    }

} while (true);

				break;
				
			 case 6: //(add a book to an already existing order
				 System.out.println("enter order id");
				 String cusid = input.next();
				 System.out.println("enter the title of the book");
				 input.nextLine();
				 String T =  input.nextLine();
				 
				 try {
        Books book = library1.searchBook(T); // may throw

        Order order = library1.searchOrder(cusid); // assuming this returns null if not found
        if (order != null) {
            order.addItem(book);
            System.out.println("Book was added");
        } else {
            System.out.println("Order does not exist");
        }

    } catch (BookNotFoundException e) {
        System.out.println("Book does not exist");
    }				 break;
				
			case 7://$ add discount(normal discount)
			System.out.println("enter the percent of the discount");
			int  d= input.nextInt();
			input.nextLine();
			System.out.println("enter the order ID");
			String cusID = input.next();
			input.nextLine();
			
			if(library1.searchOrder(cusID)!= null) {
				
				System.out.printf("Price after discount: %.2f\n", library1.searchOrder(cusID).addDiscount(d));

			}
			else 
				System.out.println("order does not exist, discount can't be added");
				break;
				
				
			case 8: //$ add special discount  
				int enter =0;
				do {
				System.out.println("enter which type of book you want to add a discount:");
				System.out.println("1- Fiction");
				System.out.println("2- Novel");
				System.out.println("3- Short story");
				System.out.println("4- Non fiction");
				System.out.println("5- Science");
				System.out.println("6- Exit");
				enter = input.nextInt();
				
				if (enter == 6) {
					System.out.println("returning to the main menu");
					break;}
				
				System.out.println("enter order id");
				String custID = input.next();
				
				switch(enter) {
				case 1: //Fiction
					if(library1.searchOrder(custID)!= null) { 
						System.out.printf("Price after discount: %.2f\n", library1.searchOrder(custID).addSpecialDiscountFiction());
						
					}
					else 
						System.out.println("order does not exist, special discount can't be applied");
					break;
					
				case 2: //Novel
					if(library1.searchOrder(custID)!= null) {
						System.out.printf("Price after discount: %.2f\n",library1.searchOrder(custID).addSpecialDiscountNovel());
					}
					else 
						System.out.println("order does not exist, special discount can't be applied");
					break;
					
				case 3: //Short story
					if(library1.searchOrder(custID)!= null) {
						
						System.out.printf("Price after discount: %.2f\n",library1.searchOrder(custID).addSpecialDiscountShortStory());

					}
					else 
						System.out.println("order does not exist, special discount can't be applied");
					break;
				case 4: { //Non 
					if(library1.searchOrder(custID)!= null) {
						
						System.out.printf("Price after discount: %.2f\n",library1.searchOrder(custID).addSpecialDiscountNonFiction());

					} 
					else 
						System.out.println("order does not exist, special discount can't be applied");
				}
					break;
				case 5: //Science
					if(library1.searchOrder(custID)!= null) {
						
						System.out.printf("Price after discount: %.2f\n",library1.searchOrder(custID).addSpecialDiscountScience());

					}
					else 
						System.out.println("order does not exist, special discount can't be applied");
					break;
				
				}
				
				}while(enter != 6);
			
				break; 

          
				
			case 9: //__ search inside order
				System.out.println("enter the order ID");
				String orID = input.next();
				input.nextLine();
				System.out.println("enter the title of the book");
				String t = input.next();
				input.nextLine();
				if(library1.searchOrder(orID) !=null) {
					if(library1.searchOrder(orID).searchItem(t))
					System.out.println("book is in the order");
				else
					System.out.println("book is not in the order");
				}
				else
					System.out.println("order does not exist");
				break;
				
			case 10: //__ search for an order
				System.out.println("enter the order ID");
				String ordID = input.next();
				input.nextLine();
				if (library1.searchOrder(ordID) == null) 
					System.out.println("there is no order with such id");
				else {
					System.out.println("the order with the id:");
					System.out.println(library1.searchOrder(ordID));
				}
				break;
				
			case 11: //__ delete order item
				System.out.println("enter the order ID");
				String orderID = input.next();
				input.nextLong();
				System.out.println("enter the title of the book to remove: ");
				String ti = input.nextLine();
				
				if(library1.searchOrder(orderID).removeItem(ti))
					System.out.println("book is removed from order");
				else
					System.out.println("book wasn't removed");
				break;
			
			case 12: //__ delete order
				System.out.println("enter the order ID");
				String OrdID = input.next();
				if(library1.removeOrder(OrdID))
					System.out.println("order has been removed");
				else
					System.out.println("order wasn't removed");
				
				break;
			
			case 13: //$ show order list
				System.out.println("list of all orders: ");
				System.out.println("number of orders: " +library1.noo);
				for (int i = 0; i< library1.noo ; i++) {
					System.out.println(library1.ListOfOrders[i]);
				}
				
				break;
				
			case 14: //exit
				System.out.println("Exiting the system...");
				System.out.println("See you next time");
				break;
			
				
				
			
			
			
			
			}//end of switch for main menu
				} catch(InputMismatchException e) {    //Unchecked Exception
				System.out.println("Invalid input!  please try again.");
				input.next();
				ch = 0;
						}
			
		}while(ch != 14); //end of main loop
		 

	}//end of main 
}//end of class


