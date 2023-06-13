import GLOOP.GLKugel;

public class leuchten extends Ball{

    public leuchten(double pX, double pY, double pZ, double pRadius) {
        super(pX, pY, pZ, pRadius);

        kugel.setzeFarbe(0,255,0);
    }
 public void licht() {
        int x=0;
        int y = 0;
        int z=0;
     if (this.gibX() > -800 || this.gibX() > 800) {
         kugel.setzeSelbstleuchten(x, y, z);
        x=x+1;
         y=y+1;
         z=z+1;
     }
 }


double gibX(){
return kugel.gibX();
}
}
