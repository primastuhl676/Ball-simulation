import GLOOP.*;
public class Metal extends Ball{
    //public  GLKugel k1;
    public Metal(double pX, double pY, double pZ, double pRadius) {
        super(pX, pY,pZ,pRadius);
        kugel=new GLKugel(0,200,0,20);
        kugel.setzeTextur("index");
    }
}
