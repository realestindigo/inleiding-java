package h03;




import java.awt.*;
import java.applet.*;

public class Javah4_5 extends Applet {

    public void init() {
        setSize(800, 800);

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);

        g.fillArc(20, 20, 400, 300, 120, 360);



    }
}