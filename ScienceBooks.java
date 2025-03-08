package javaphase1;

public class Science extends NonFiction {
	  protected String scientificField;
	  
	  public Science(String t,String a, String p,double pr,int y,int e,String lg, String sf) {
			super(t,a,p,pr,y, e, lg);
			scientificField = sf;
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
