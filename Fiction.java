package finction;

public class Fiction extends books {
protected int numOfpages; //number of pages in book
protected String genre;  //suspense-drama-action
protected String Series; //part 2 from book gg    
  public Fiction(String t, String a, String p, double pr, int y , int noc, int o, String fic, String Ser){
    super(t,a,p,pr,y,noc);
    numOfpages=o;
    bookClassification = fic;
    bookSeries = Ser;
}
public double Discount(){
  return 0.0
    }
  public String toString(){
    return super.toString()+"Number Of pages:"+numOfpages+"genre of finction:"+genre+"Book Series:"+Series;
  }
  public void updateGenre(String Ngenre){
    this.genre = Ngenre;
  }
  public boolean isPartOfSeries(){
    return (this.Series !=null&& !this.Series.isEmpty());
