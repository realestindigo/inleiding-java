package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java10_2 extends Applet {

    TextField start;
    String s,text1, text2;
    int getal1,getal2, getal3, getal4;


    public void init() {
        start = new TextField("",20);
        start.addActionListener(new startListener());
        getal1 = -2147483648;
        getal3 =  2147483647 ;
        add(start);
    }

    public void paint(Graphics g) {
        g.drawString("Hoogste getal: " + text1,50,50);
        g.drawString("Laagste getal: " + text2,50,70);
    }

    class startListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = start.getText();
            getal2 = Integer.parseInt(s);
            text1 = String.valueOf(getal1);

            if (getal1 < getal2) {
                text1 = String.valueOf(getal2);
                getal1 = getal2;
            } else {
                text1 = String.valueOf(getal1);
            }

            s = start.getText();
            getal4 = Integer.parseInt(s);
            text2 = String.valueOf(getal3);
            if (getal3 > getal4) {
                text2 = String.valueOf(getal4);
                getal3 = getal4;
            } else {
                text2 = String.valueOf(getal3);
                repaint();
            }
        }

    }
}