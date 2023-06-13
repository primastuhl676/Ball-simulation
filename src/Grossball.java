import GLOOP.*;
public class Grossball extends Ball{
double a=0;
    public Grossball(double pX, double pY, double pZ,double pRadius) {

        super(pX, pY, pZ,pRadius);
        kugel.setzeFarbe(0,0,0);
a=pRadius;
    }
public void gross(){
if(this.gibX()>700||this.gibX()<-700){a=a+2;}


}

double gibX(){
 return kugel.gibX();
}
}
