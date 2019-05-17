package h11;

import java.awt.*;
import java.applet.*;


public class Java11_1 extends Applet {
    int x;
    int y1;




    public void init() {
        x = 10;
        y1 = 50;

    }

    public void paint(Graphics g) {
        // g.drawLine(50,50,50,150);
        for (int i = 10; i < 21; i++) {
            g.drawString("Getallen: " + x, 50, y1);
            x = x + 1;
            y1 = y1 + 20;
        }

    }
}