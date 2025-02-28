package javaphase1;

public abstract class books {
	protected String title; //title of the book
	protected String author; //author of the book
	protected double price; //price of the book
	protected String publisher; //publisher of the book
	protected int year; //the year the book was published in
	protected int noc; //number of copies available
	
	public abstract double specialDiscount(); //gives a discount based on the type of the book and other factors
	
	public double  discount(int percent) { //gives a discount by percent
		return price * (percent/100);
	}
	//i made both of the methods double because the price is double so we son't have to cast anything
	//remove this comment later**
}
