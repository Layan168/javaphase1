package javaphase1;

public class Science extends NonFiction {
	  protected String scientificField;
	  
	  public Science(String t,String a, String p,double pr,int y,int noc,int e,String lg, String sf) {
			super(t,a,p,pr,y,noc, e, lg);
			scientificField = sf;
		}
	  
	     public static boolean checkForExperimentalContent(String scientificField  ) {
	        if (scientificField.equalsIgnoreCase("Physics") || scientificField.equalsIgnoreCase("chemistry") ) 
			retrurn true;
		     else
			return false;
	           
	     }

		public String getScientificField() {
			return scientificField;
		}

		public void setScientificField(String scientificField) {
			this.scientificField = scientificField;
		}
	     
	    
}
