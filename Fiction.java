package finction;

public class Fiction extends books {
protected int numOfpages; //number of pages in book
protected String bookClassification;  //suspense-drama-action
protected String bookSeries; //part 2 from book gg    
  public Fiction(String t, String a, String p, double pr, int y , int noc, int o, String fic, String Ser){
    super(t,a,p,pr,y,noc);
    numOfpages=o;
    bookClassification = fic;
    bookSeries = Ser;
}
