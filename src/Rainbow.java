import GLOOP.*;
public class Rainbow extends Ball{
    public  GLKugel k1;
    public Rainbow(double pX, double pY, double pZ, double pRadius) {
        super(pX, pY, pZ, pRadius);
        k1=new GLKugel(0,200,0,20);
       k1.setzeFarbe(0,0,0);
    }
}
