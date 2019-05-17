package h03;




import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
        setSize(1100, 1000);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.drawLine(50, 120, 350, 120);
        g.drawString("Lijn" ,180, 140);

        g.drawRect(50, 200, 300,200);
        g.drawString("Rechthoek" ,175, 420);

        g.drawRoundRect(50,500,300,200, 20,20);
        g.drawString("Afgeronde rechthoek", 150, 720);

        g.setColor(Color.magenta);
        g.fillRect(400, 200, 300,200);

        g.setColor(Color.black);
        g.drawArc(400, 200, 300, 200, 120,360);
        g.drawString("Gevulde rechthoek met ovaal", 470, 420);

        g.setColor(Color.magenta);
        g.fillArc(400, 500, 300, 200, 120,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 510, 720);

        g.drawArc(750, 200, 300, 200, 120,360);
        g.setColor(Color.magenta);
        g.fillArc(750, 200, 300, 200, 360,40);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 810, 420);

        g.drawArc(750, 500, 300, 200, 360, 360);
        g.drawString("ovaal", 890, 720);

    }
}
