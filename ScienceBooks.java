package finction;

public class ScienceBooks extends Non_fiction {
  private String scienticField;
  
//constructor
  
  public void checkForRecentUpdates(int currentYear){
    int yearsSincePublication=currentYear-getYearOfEdition();
    if(yearsSincePublication<=2)
      System.out.println("This book has the lastest scientific updates.")
        else
     System.out.println("This book may not have the lastest scientific updates.") 

      
     public void checkForExperimentalContent() {
        if (scientificField.equalsIgnoreCase("Physics")) {
            System.out.println("This book contains scientific experiments.");
        } else if 
}
