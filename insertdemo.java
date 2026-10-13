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