package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst,mpp;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Results:");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
        g.drawString(mpp, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "1 = Zeer Slecht";
                    break;
                case 2:
                    tekst = "2 = Slecht";
                    break;
                case 3:
                    tekst = "3 = Ruim Onvoldoende";
                    break;
                case 4:
                    tekst = "4 = Onvoldoende";
                    break;
                case 5:
                    tekst = "5 = Matig";
                    break;
                case 6:
                    tekst = "6 = Voldoende";

                    break;
                case 7:
                    tekst = "7 = Ruim Voldoende";
                    break;
                case 8:
                    tekst = "8 = Goed";
                    break;
                case 9:
                    tekst = "9 = Zeer Goed";
                    break;
                case 10:
                    tekst = "10 = Uitstekend";
                    break;

                default:
                    tekst = "Cijfer kan niet lager zijn dan 1";
                    mpp = "Cijfer kan niet hoger zijn dan 10";
                    break;
            }
            repaint();
        }
    }
}