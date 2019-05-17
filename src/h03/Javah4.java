package h03;



import java.awt.*;
import java.applet.*;

public class Javah4 extends Applet {

    public void init() {
        setSize(1000, 1000);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawLine(500,250,250,700);
        g.drawLine(500,250, 700,700);
        g.drawLine(250, 700, 700,700);
    }
}
