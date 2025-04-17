package javaphase1;

public class Science extends NonFiction {
	  protected String scientificField;
	  
	  public Science(String t,String a, String p,double pr,int y,int e,String lg, String sf) {
			super(t,a,p,pr,y, e, lg);
			scientificField = sf;
		}
	  
	     public double specialDiscount() {
	    	 if (scientificField.equalsIgnoreCase("Ecology")) {
	    		 price = price -(price * 0.10);
	    	 }
	    	 return price;
	     }
	  
	     public String checkForExperimentalContent() {
	        if (scientificField.equalsIgnoreCase("Physics") || scientificField.equalsIgnoreCase("chemistry") ) {
	            return "This book contains scientific experiments.";
	        } else 
	        	return "This book doesn't have any scientific experiments";
	     }

		public String getScientificField() {
			return scientificField;
		}

		public void setScientificField(String scientificField) {
			this.scientificField = scientificField;
		}
		
		public String toString(){
		    return super.toString() + "  Scientific field: " + scientificField + " does the book have experiments: "+ checkForExperimentalContent();
		  }
	     
	    
}
