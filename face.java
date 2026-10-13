AIM
To write a Java program using the Graphics class to draw a human face with eyes, pupils, nose, mouth, and ears in an applet.
ALGORITHM
1. Start the program.
2. Import the java.awt and java.applet packages.
3. Create a class named face that extends the Applet class.
4. Override the paint(Graphics g) method.
5. Use drawOval() to draw the face outline.
6. Use drawOval() to draw the two eyes.
7. Use fillOval() to draw the pupils.
8. Use fillOval() to draw the nose.
9. Use fillArc() to draw the mouth.
10. Use drawOval() to draw the two ears.
11. Display the face in the applet.
12. Stop the program.

PROGRAM:
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

RESULT
Thus, the Java program using the Graphics class was written to draw a human face with eyes, pupils, nose, mouth, and ears in an applet.
