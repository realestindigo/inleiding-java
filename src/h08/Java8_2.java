package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Java8_2 extends Applet {
    Label label;
    Button manKnop;
    Button vrouwKnop;
    Button jongenKnop;
    Button meisjesKnop;

    String Man;
    String Vrouw;
    String Jongen;
    String Meisje;

    int teller;
    int Persoon1, Persoon2, Persoon3, Persoon4;


    public void init(){
        label = new Label("Aantal mensen binnenkomen");
        manKnop = new Button ("Man");
        vrouwKnop = new Button ("Vrouw");
        jongenKnop = new Button ("Jongen");
        meisjesKnop = new Button ("Meisje");

        manKnop.addActionListener(new eenListener());
        vrouwKnop.addActionListener(new tweeListener());
        jongenKnop.addActionListener(new drieListener());
        meisjesKnop.addActionListener(new vierListener());



        add(label);
        add(manKnop);
        add(vrouwKnop);
        add(jongenKnop);
        add(meisjesKnop);
        Man = "Man:";
        Vrouw ="Vrouw:";
        Meisje ="Meisje:";
        Jongen = "Jongen:";


    }

    public void paint(Graphics g){
    g.drawString(Man + Persoon1,50,50);
    g.drawString(Vrouw + Persoon2,50,70);
    g.drawString(Jongen + Persoon3, 50,90);
    g.drawString(Meisje + Persoon4, 50, 110);
    }
    class eenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Persoon1 = 0 + Persoon1;
            Persoon1++;
            repaint();

        }
    }

    class tweeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Persoon2 = 0 + Persoon2;
            Persoon2++;


            repaint();
        }
    }


    class drieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Persoon3 = 0 + Persoon3;
            Persoon3++;

            repaint();
        }
    }
    class vierListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Persoon4 = 0 + Persoon4;
            Persoon4++;


            repaint();
        }
}


}