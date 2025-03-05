package javaphase1;

public class novel extends fiction {
protected int recommendedAge;// less than 18 or for 5 to 9 
  public novel (String t, String a, String p, double pr, int y, int noc, int o , String fic, String ser, int rec){
    super(t,a,p,pr,y,noc,o,fic,ser,rec);
    recommendedAge = rec;
}
public void setRecommendedAge(int age){
  recommendedAge = age;
}
  public int getRecommendedAge(){
    return recommendedAge;
  }
  public double specialDiscount(){
    if(numOfpages>800)
      return price - (price *0.25);
    else
      if(numOfpages>600)
        return price - (price *0.15);
    else
        if(numOfpages>400)
          return price - (price * 0.10);
    return price;
  }
  public String toString(){
    return super.toString()+"   recommended Age for novel book"+recommendedAge;
}
