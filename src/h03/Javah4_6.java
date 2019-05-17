package h03;




import java.awt.*;
import java.applet.*;

public class Javah4_6 extends Applet {

    public void init() {
        setSize(800, 800);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.black);
        g.fillRect(150, 150, 200, 400);
        g.fillRect(250, 500, 10,300);
        g.setColor(Color.green);
        g.fillArc(200, 170, 100,100, 50, 360);
        g.setColor(Color.orange);
        g.fillArc(200, 300, 100,100, 50, 360);
        g.setColor(Color.red);
        g.fillArc(200, 430, 100,100, 50, 360);


    }
}
