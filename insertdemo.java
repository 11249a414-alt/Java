AIM
To write a Java program to demonstrate the BorderLayout manager in an applet by placing buttons and a text area in the North, South, East, West, and Center regions.
ALGORITHM
1. Start the program.
2. Import the java.awt and java.applet packages.
3. Create a class named insertdemo that extends the Applet class.
4. Override the init() method.
5. Set the background color of the applet to cyan.
6. Set the layout manager to BorderLayout.
7. Add a button with the text “This is across the top” to the North region.
8. Add a button with the text “The footer message might go here” to the South region.
9. Add buttons labeled “RIGHT” and “LEFT” to the East and West regions, respectively.
10. Create a TextArea containing the message “The reasonable man adapts” and add it to the Center region.
11. Override the getInsets() method to set a 10-pixel margin on all sides.
12. Display the applet.
13. Stop the program.

 PROGRAM:
import java.awt.*;
import java.applet.*;

 /*
 <applet code="insertdemo.class" width="400" height="200"></applet>
 */

public class insertdemo extends Applet {

    public void init() {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());

        add(new Button("This is across the top"), BorderLayout.NORTH);
        add(new Button("The footer message might go here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);

        String msg = "The reasonable man adapts\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);
    }

    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }
}
RESULT
Thus, the Java program demonstrating the BorderLayout manager was written to arrange buttons in the North, South, East, and West regions and a text area in the Center region, with a cyan background.
