package javaphase1;

public abstract class Books {
	protected String title; //title of the book
	protected String author; //author of the book
	protected double price; //price of the book
	protected String publisher; //publisher of the book
	protected int year; //the year the book was published in
	protected int noc; //number of copies available
	
	public Books (String t, String a, String p, double pr, int y, int noc) {
	title = t;
	author = a;
	publisher = p;
	price = pr;
	year = y;
	this.noc = noc;
	}
	
	
	public abstract double specialDiscount(); //gives a discount based on the type of the book and other factors
	
	public double  discount(int percent) { //gives a discount by percent
		return price * (percent/100);
	}
	//i made both of the methods double because the price is double so we son't have to cast anything
	//remove this comment later**
	
	public String toString() {
		return "title: " + title + "  author: " + author + "  publisher: "+ publisher+ "  price: " + price + "  year: "+ year + "number of copies available: " + noc;
	}
	
	//setters and getters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNoc() {
		return noc;
	}

	public void setNoc(int noc) {
		this.noc = noc;
	}
	
}
