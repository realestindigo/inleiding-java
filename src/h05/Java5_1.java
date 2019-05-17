package h05;

import java.awt.*;
import java.applet.*;

public class Java5_1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        setSize(1100, 1000);
        opvulkleur = Color.yellow;
        lijnkleur = Color.black;
        breedte = 300;
        hoogte= 200;



    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.drawLine(50, 120, 350, 120);
        g.drawString("Lijn" ,180, 140);

        g.drawRect(50, 200, breedte,hoogte);
        g.drawString("Rechthoek" ,175, 420);

        g.drawRoundRect(50,500,breedte,hoogte, 20,20);
        g.drawString("Afgeronde rechthoek", 150, 720);

        g.setColor(opvulkleur);
        g.fillRect(400, 200, breedte,hoogte);

        g.setColor(Color.black);
        g.drawArc(400, 200, breedte, hoogte, 120,360);
        g.drawString("Gevulde rechthoek met ovaal", 470, 420);

        g.setColor(opvulkleur);
        g.fillArc(400, 500, breedte, hoogte, 120,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 510, 720);

        g.drawArc(750, 200, breedte, hoogte, 120,360);
        g.setColor(opvulkleur);
        g.fillArc(750, 200,breedte, hoogte, 360,40);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 810, 420);

        g.drawArc(750, 500, breedte, hoogte, 360, 360);
        g.drawString("ovaal", 890, 720);

    }
}
