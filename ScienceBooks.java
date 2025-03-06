package javaphase1;

public class Science extends NonFiction {
	  protected String scientificField;
	  
	  public Science(String t,String a, String p,double pr,int y,int noc,int e,String lg, String sf) {
			super(t,a,p,pr,y,noc, e, lg);
			scientificField = sf;
		}
	  
	  public void checkForRecentUpdates(int currentYear){//delete this
	    int yearsSincePublication=currentYear-year;
	    if(yearsSincePublication<=2)
	      System.out.println("This book has the lastest scientific updates.");
	        else
	     System.out.println("This book may not have the lastest scientific updates."); 
	  }
	      
	     public void checkForExperimentalContent() {
	        if (scientificField.equalsIgnoreCase("Physics") || scientificField.equalsIgnoreCase("chemistry") ) {
	            System.out.println("This book contains scientific experiments.");
	        } else 
	        	System.out.println("This book doesn't have any scientific experiments");
	     }

		public String getScientificField() {
			return scientificField;
		}

		public void setScientificField(String scientificField) {
			this.scientificField = scientificField;
		}
	     
	    
}
