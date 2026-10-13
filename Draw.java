AIM
To write a Java program using the Graphics class to draw lines, rectangles, filled rectangles, rounded rectangles, and intersecting lines in an applet.
ALGORITHM
1. Start the program.
2. Import the java.awt, java.io, and java.applet packages.
3. Create a class named Draw that extends the Applet class.
4. Override the paint(Graphics g) method.
5. Use drawLine() to draw straight lines.
6. Use drawRect() to draw an outline rectangle.
7. Use fillRect() to draw a filled rectangle.
8. Use drawRoundRect() to draw an outline rounded rectangle.
9. Use fillRoundRect() to draw a filled rounded rectangle.
10. Draw two intersecting lines using drawLine().
11. Display the graphics in the applet.
12. Stop the program.
    
PROGRAM:
import java.awt.*;
import java.io.*;
import java.applet.*;

public class Draw extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(10, 50, 50, 50);
        g.drawRect(10, 60, 40, 30);
        g.fillRect(60, 10, 30, 80);
        g.drawRoundRect(10, 100, 80, 50, 10, 10);
        g.fillRoundRect(20, 110, 60, 30, 5, 5);
        g.drawLine(100, 10, 230, 140);
        g.drawLine(100, 140, 230, 10);
    }
}

RESULT
Thus, the Java program using the Graphics class was written to draw lines, rectangles, filled rectangles, rounded rectangles, and intersecting diagonal lines in an applet.
