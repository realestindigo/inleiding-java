package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Java8_3 extends Applet {
    TextField text;

    Button OkKnop;

    String s;
    double Uitkomst;
    double Btw;
    Label label;



    public void init() {
        label = new Label("Exclusief Btw");
        text = new TextField("", 30);
        OkKnop = new Button("Ok");
        text.addActionListener(new tekstvakListener());
        OkKnop.addActionListener(new knopListener());
        Btw = 1.21;


        add(label);
        add(text);
        add(OkKnop);
        s = "Inclusief Btw:";








    }

    public void paint(Graphics g) {

        g. drawString("Inclusief Btw:" + Uitkomst,50,60);







    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = text.getText();
            Uitkomst = Double.parseDouble( s )* Btw;



            repaint();

        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = text.getText();
            Uitkomst = Double.parseDouble( s )*Btw;



            repaint();
        }
    }

}