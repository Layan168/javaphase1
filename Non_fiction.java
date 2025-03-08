package javaphase1;

public class NonFiction extends Books {
	protected int edition;
	protected String language;
	
	public NonFiction(String t,String a, String p,double pr,int y,int e,String lg) {
		super(t,a,p,pr,y);
		edition=e;
	    language=lg;
	}
	
  
  public double specialDiscount(){
	  int currentYear = 2025;
	  int ageOfEdition= currentYear-edition;
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
	 
	 double discountValue= price * discountPercentage;
	  return price = price -discountValue;
  }
	  
	  
     public int getEdition() {
	return edition;
}

public void setEdition(int edition) {
	this.edition = edition;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

//check if book has translation based on the language
	public boolean isTranslated(String language) {  
			if (language.equalsIgnoreCase("Arabic"))  
				return true;  
			else  
				return false;  
	}
	     
    public String tostring(){
      return super.toString()+"  language: " +language + "  Edition's year: "+ edition;
    }
}
