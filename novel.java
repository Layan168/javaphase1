package javaphase1;

public class Novel extends Fiction {
	protected int recommendedAge;
	  public Novel (String t, String a, String p, double pr, int y, int o , String fic, String ser, int rec){
	    super(t,a,p,pr,y,o,fic,ser);
	    recommendedAge = rec;
	}
	
	  public double specialDiscount(){
	    if(numOfpages>800)
	      return price = price - (price *0.25);
	    else
	      if(numOfpages>600)
	        return price = price - (price *0.15);
	    else
	        if(numOfpages>400)
	          return price = price - (price * 0.10);
	        else
	        	return price;
	  }
	  public String toString(){
	    return super.toString()+"  recommended Age for novel book: "+recommendedAge;
	}
	  
	 public void setRecommendedAge(int age){
		  recommendedAge = age;
		}
	 public int getRecommendedAge(){
		    return recommendedAge;
		  }
	  

}
