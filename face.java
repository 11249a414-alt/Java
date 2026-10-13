import java.awt.*;
import java.applet.*;

/*
<applet code="face.class" height="300" width="300">
</applet>
*/

public class face extends Applet {

    public void paint(Graphics g) {
        // Face outline
        g.drawOval(40, 40, 120, 150);

        // Eyes
        g.drawOval(57, 73, 30, 20);
        g.drawOval(110, 75, 30, 20);

        // Pupils
        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        // Nose
        g.fillOval(85, 100, 30, 30);

        // Mouth
        g.fillArc(60, 125, 80, 40, 180, 180);

        // Ears
        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}