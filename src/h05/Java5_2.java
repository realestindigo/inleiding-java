package h05;

import java.applet.*;
import java.awt.*;
public class Java5_2 extends Applet{
    //Declare variables
    int Valerie;
    int Hans;
    int Jeroen;

    public void init(){
        Valerie = 50;
        Hans = 75;
        Jeroen = 125;
    }

    public void paint(Graphics g){
        setBackground(Color.white);

        g.drawLine(50,20,50,175);// Y as lijn
        g.drawLine(50,175,195,175);//X as lijn
        // Namen:
        g.drawString("Valerie", 55,195);
        g.drawString("Hans", 110,195);
        g.drawString("Jeroen", 155,195);
        //Getallen y as:
        g.drawString("100", 27, 50);
        g.drawString("80", 34, 75);
        g.drawString("60", 34, 100);
        g.drawString("40", 34, 125);
        g.drawString("20", 34, 150);
        g.drawString("0", 40, 175);
        //Staaf
        g.setColor(Color.red);//kleur rood
        g.fillRect(55,175-Valerie,40,Valerie);

        g.setColor(Color.blue);//kleur
        g.fillRect(105,175-Hans,40,Hans);

        g.setColor(Color.magenta);//kleur
        g.fillRect(155,175-Jeroen,41,Jeroen);


    }
}