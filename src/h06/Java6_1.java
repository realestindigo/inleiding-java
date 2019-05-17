package h06;

        import java.awt.*;
        import java.applet.*;


public class Java6_1 extends Applet {

    double a;
    double b;
    int c;

    double uitkomst;

    public void init() {
    a = 56.50;
    b = 56.50;
    c = 4;

    uitkomst = ( a + b ) / c;
    }

    public void paint(Graphics g) {
        g.drawString("Jan : " + uitkomst, 20, 20);
        g.drawString( " Ali : " + uitkomst, 20, 40);
        g.drawString(" Jeanette : " + uitkomst, 20, 60);
        g.drawString(" Ik : " + uitkomst, 20, 80);
    }
}
