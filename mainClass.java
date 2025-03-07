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
				 int c;
         System.out.println("to make new order");
          System.out.println("the number of books the customer wants to purchase");
           int size = input.nextInt();
         Books[] orderItem;
         orderItem = new orderItem[size];
         
          System.out.println("enter customer name");
         String nm = input.nextLine();
         input.nextLine();
          System.out.println("enter customer id");
          int ii = input.nextInt();
           Books[] orderItems = new Order(nm,ii,size);
           do{
           System.out.println("to add new Item in order enter 1 to exite enter 0");
           c = input.nextInt();
         switch(c){
         case 1:
			 if(orderItems.addItem)
        System.out.println("your adding is successful");
        else
        Suystem.out.println("the order Items is full! sorry");
           break;
         case 2:
         break;
         }
			}while(c != 0);

				break;
				
			case 6://$ add discount(nromal discout)
			System.out.println("add percent that you want to discount");
          int  dp= input.nexInt();
          int xx;
          do{
          System.out.println("enter number that you want to see after the discount for these books");
          System.out.println("1- discount for book1");
          System.out.println("2- discount for book2");
          System.out.println("3- discount for book3");
          System.out.println("4- discount for book4");
          System.out.println("5- discount for book5");
          System.out.println("6- discount for book6");
          System.out.println("7- discount for book7");
          System.out.println("8- discount for book8");
          System.out.println("9- discount for book9");
          System.out.println("10- discount for book10");
          System.out.println("11- discount for book11");
          System.out.println("12- discount for book12");
          System.out.println("13- discount for book13");
          System.out.println("14- discount for book14");
          System.out.println("15- discount for book15");
          System.out.println("0- to exite");
          xx = input.nextInt();
          switch(xx){
          case 0: 
				break;
          case 1: book1.discount(dp);
				break;
          case 2: book2.discount(dp);
				break;  
          case 3: book3.discount(dp);
				break;  
          case 4: book4.discount(dp);
				break;  
			 case 5: book5.discount(dp);
				break;
            case 6: book6.discount(dp);
				break;
            case 7: book7.discount(dp);
				break;
            case 8: book8.discount(dp);
				break;
            case 9: book9.discount(dp);
				break;
            case 10: book10.discount(dp);
				break;
            case 11: book11.discount(dp);
				break;
            case 12: book12.discount(dp);
				break;
            case 13: book13.discount(dp);
				break;
            case 14: book14.discount(dp);
				break;
            case 15: book15.discount(dp);
				break;
            }while(xx !=0);
	
				break;
				
			case 7://$ add special discount
				int gr;
         do{
         System.out.println("choose one to see the special discount");	
         System.out.println("1- fiction");	
         System.out.println("2- non Fiction");
         System.out.println("3-Short Story");
         System.out.println("4-novel");	
         System.out.println("5-Science");
          System.out.println("6- to exite");	
          gr = input.nexInt();
          switch(gr){
          case 1:
          System.out.println("for book 7"+book7.specalDescount());
          System.out.println("for book 8"+book8.specalDescount());
          System.out.println("for book 9"+book9.specalDescount());
             break;
          case 2:
          System.out.println("for book 13"+book13.specalDescount());
          System.out.println("for book 14"+book14.specalDescount());
          System.out.println("for book 15"+book15.specalDescount());
          break;
          
          case 3:
           System.out.println("for book 10"+book10.specalDescount());
          System.out.println("for book 11"+book11.specalDescount());
          System.out.println("for book 12"+book12.specalDescount());
          break;

          case 4: 
           System.out.println("for book 4"+book4.specalDescount());
          System.out.println("for book 5"+book5.specalDescount());
          System.out.println("for book 6"+book6.specalDescount());
          break;

          case 5:
           System.out.println("for book 1"+book1.specalDescount());
          System.out.println("for book 2"+book2.specalDescount());
          System.out.println("for book 3"+book3.specalDescount());
          break;

          
          case 6:			
				break;
             }
            }while(gr !=6 );

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
				Order.toString();
				break;
				
			case 13: //exit
				System.out.println("Exiting the system...");
				System.out.println("See you next time");
				break;
			
				
				
			
			
			
			
			}//end of sweitch for main menu
			
			
		}while(ch != 13); //end of main loop
		 

	}

}
