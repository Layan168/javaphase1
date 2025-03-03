package project;

public class Non_fiction {
	private String subject;
	private int edition;
	private String language;
	
public NOn_fiction(String t,String a,string p,double pr,int y,int noc,String s,int e,String lg) {
		super(t,a,p,pr,y,noc);
		sbject=s;
		edition=e;
	        language=lg;
	}
  
  public double specialDiscount(){
	  double newPrice=0;
    if(getnoc()>10)
      return getprice() * 0.80;
  } else {
    return getprice() * 0.90;
    
    public String tostring(){
      return super.toString()+", Subject:"+subject+", Edition:"+edition;
}
