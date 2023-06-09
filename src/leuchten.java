import GLOOP.GLKugel;

public class leuchten extends Ball{

    public leuchten(double pX, double pY, double pZ, double pRadius) {
        super(pX, pY, pZ, pRadius);
        kugel=new GLKugel(0,200,0,20);
        kugel.setzeFarbe(222,222,222);
    }
 public void licht(){
   if (this.gibX()>-800||this.gibX()>800){
  kugel.setzeSelbstleuchten(100,100,100);}
   else {kugel.setzeSelbstleuchten(0,0,0);}
 }


double gibX(){
return kugel.gibX();
}
}
