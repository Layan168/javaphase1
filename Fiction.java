package javaphase1;

public class Fiction extends Books {
	protected int numOfpages; //number of pages in book
	protected String genre;  //suspense-drama-action
	protected String series; //part 2 from book     
	  public Fiction(String t, String a, String p, double pr, int y , int o, String fic, String Ser){
	    super(t,a,p,pr,y);
	    numOfpages=o;
	    genre = fic;
	    series = Ser;
	}
	  
	  
	public double specialDiscount(){
	  return  price = price - (price * 0.25) ;
	    }
	
	  public String toString(){
	    return super.toString()+"  Number Of pages: "+numOfpages+" genre of finction: "+genre+"  Book Series: "+series;
	  }
	  
	  public boolean isPartOfSeries(){ 
	    return (!series.equals("none" ));
	  }


	public int getNumOfpages() {
		return numOfpages;
	}


	public void setNumOfpages(int numOfpages) {
		this.numOfpages = numOfpages;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getSeries() {
		return series;
	}


	public void setSeries(String series) {
		this.series = series;
	}
	  
	  

}
