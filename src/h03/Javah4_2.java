package h03;



import java.awt.*;
import java.applet.*;

public class Javah4_2 extends Applet {

    public void init() {
        setSize(1000, 1000);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawLine(250,125,125,350);
        g.drawLine(250,125, 350,350);
        g.drawLine(125, 350, 350,350);

        g.drawRect(125,350,224,250);
        g.drawRect(175, 400, 50, 50);
        g.drawRect(250, 500, 50, 100);

    }
}