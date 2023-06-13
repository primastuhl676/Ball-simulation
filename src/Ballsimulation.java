import GLOOP.*;
public class Ballsimulation{
    private GLKamera kamera;
    GLLicht licht;
    GLHimmel himmel;
    GLBoden boden;
    private GLTastatur tastatur;

    protected Ball ball;
    protected leuchten ball1;
    protected Metal ball2;
    protected Grossball ball3;
    private Hindernis[] hindernis;

    public Ballsimulation(){
        kamera = new GLSchwenkkamera(800,500);
        kamera.setzePosition(0,500,2000);
        licht  = new GLLicht();       
        boden  = new GLBoden("src/Boden.jpg");
        himmel = new GLHimmel("src/Himmel.jpg");
        tastatur = new GLTastatur();

        hindernis = new Hindernis[2];
        hindernis[0] = new Hindernis(1000,200,0, 50,400,1300);
        hindernis[1] = new Hindernis(-1000,200,0, 50,400,1300);

        ball = new Ball (0,200,0, 20);
        ball.werfen(new GLVektor(0.7,0,0));
        ball1=new leuchten(0,200,0,20);
        ball1.werfen(new GLVektor(1,0,0));
        ball2=new Metal(0,200,0,20);
        ball2.werfen(new GLVektor(0.5,0,0));
        ball3=new Grossball(0,200,0,40);
        ball3.werfen(new GLVektor(1.5,0,0));

        fuehreAus();
    }

    public void fuehreAus(){
        while (!tastatur.esc()) {
            ball.bewegeDich();
            ball1.bewegeDich();
            ball2.bewegeDich();
            ball3.bewegeDich();

            int j;
            for (j = 0; j < 2; j++) {
                ball.bearbeiteHindernis(hindernis[j]);
                ball1.bearbeiteHindernis(hindernis[j]);
                ball2.bearbeiteHindernis(hindernis[j]);
                ball3.bearbeiteHindernis(hindernis[j]);

            }


            Sys.warte();
        }
        Sys.beenden();
    }
    
}
