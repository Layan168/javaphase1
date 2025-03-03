package project;
import java.util.Scanner;
public class Non_fiction {
	
	private int yearOfedition;
	private String language;
	
public NOn_fiction(String t,String a,string p,double pr,int y,int noc,String s,int e,String lg) {
		super(t,a,p,pr,y,noc);
		subject=s;
		edition=e;
	        language=lg;
	}
  
  public double specialDiscount(){
	Scanner input=new Scanner.(system.in);
	  System.out.println("Please enter the current year:");
	  int currentYear=input.nextInt();
	  
	  int ageOfEdition=currentYear-yearOfedition;
	  double discountPercentage=0;
	  if(ageOfEdition<=1)
		 discountPercentage=0.05;
	  else 
	  if(ageOfEdition<=3)
		 discountPercentage=0.10;
	  else
	if(ageOfEdition<=5)
		 discountPercentage=0.15;	
	  else
		 discountPercentage=0.20;
	 
	 double discountValue=getPrice()* discountPercentage;
	  return getPrice()-discountValue;
	  
	  
     public void isTranslated(){    // check if book has translation based on the language
	     if(language.equalsIgnoreCase("English")||language.equalsIgnoreCase("Arabic")||language.equalsIgnoreCase("French"))
		     System.out.println("Yes,it has translation.");
	     else
		    System.out.println("Unfortunately,it doesn’t have translation.");  

	     
    public String tostring(){
      return super.toString()+", Subject:"+subject+", Edition:"+edition;
}
