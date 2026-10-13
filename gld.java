AIM
To write a Java program using the GridLayout manager to arrange ten buttons labeled A to J in 5 rows and 2 columns.
ALGORITHM
1. Start the program.
2. Import the java.awt and java.applet packages.
3. Create a class named gld that extends the Applet class.
4. Override the init() method.
5. Set the layout to GridLayout(5, 2).
6. Create ten buttons labeled A, B, C, D, E, F, G, H, I, and J.
7. Add all ten buttons to the applet.
8. Set the insets to 20 pixels on all sides.
9. Display the applet.
10. Stop the program.

PROGRAM:
import java.awt.*;
import java.applet.*;

/*
<applet code="gld.class" height="300" width="300"></applet>
*/

public class gld extends Applet {

    public void init() {
        setLayout(new GridLayout(5, 2));

        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }

    public Insets getInsets() {
        return new Insets(20, 20, 20, 20);
    }
}

RESULT
Thus, the Java program using the GridLayout manager was written and executed to display ten buttons labeled A to J in 5 rows and 2 columns.
