package javaphase1;

public class shortStory extends fiction{
private int countWord;

  public shortStory(String t, String a, String p, double pr, int y, int noc, int o, String fic, String ser, int cou){
    super(t,a,p,pr,y,noc,o,fic,ser);
    countWord= cou;
    
}
public double  Discount(){
  if(countWord>3000)
    return 0.25;
  else
    if(countWord > 2000)
      return 0.15;
  else
      if(countWord > 1000)
        return 0.05;
}
  public String toString(){
    return super.toString()+"countWord of short Story"+countWord;
