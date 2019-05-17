package h03;



import java.awt.*;
import java.applet.*;

public class Javah4_3 extends Applet {

    public void init() {
        setSize(1000, 1000);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.setColor(Color.black);
        g.drawRect(125,350,500,300);

        g.setColor(Color.red);
        g.fillRect(125,350,500,100);

        g.setColor(Color.blue);
        g.fillRect(125,550,500,100);

        g.setColor(Color.black);
        g.fillRect(125,350,10,600);



    }
}