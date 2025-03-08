package javaphase1;

public class ShortStory extends Fiction{
	protected int countWord;

	  public ShortStory(String t, String a, String p, double pr, int y, int o, String fic, String ser, int cou){
	    super(t,a,p,pr,y,o,fic,ser);
	    countWord= cou;
	    
	}
	public double  specialDiscount(){
	  if(countWord>3000)
	    return price = price - (price * 0.25);
	  else
	    if(countWord > 2000)
	      return price = price - (price * 0.15);
	  else
	      if(countWord > 1000)
	        return price = price - (price * 0.05);
	      else 
	    	  return price;
	}
	  public String toString(){
	    return super.toString()+"  countWord of short Story: "+countWord;
	  }
	  
	  public int getCountWord() {
			return countWord;
		}
	  public void setCountWord(int countWord) {
			this.countWord = countWord;
		}

}
