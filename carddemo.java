AIM
To write a Java program to demonstrate the CardLayout layout manager in an applet, where clicking a button displays the next button in sequence.
ALGORITHM
1. Start the program.
2. Import the java.awt, java.applet, and java.awt.event packages.
3. Create a class named carddemo that extends Applet and implements ActionListener.
4. Declare three buttons, a panel, and a CardLayout object.
5. Create a panel and add it to the applet.
6. Set the panel's layout to CardLayout.
7. Create three buttons labeled First Button, Second Button, and Third Button.
8. Register an action listener for each button.
9. Add the buttons to the panel with unique card names.
10. In the actionPerformed() method, call buttonCardLayout.next(buttonPanel) to display the next card when a button is clicked.
11. Stop the program.

 PROGRAM:
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

 /*
 <applet code="carddemo.class" width="250" height="150"></applet>
 */

public class carddemo extends Applet implements ActionListener {

    Button b1, b2, b3;
    Panel buttonPanel;
    CardLayout buttonCardLayout;

    public void init() {
        buttonPanel = new Panel();
        add(buttonPanel);

        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);

        b1 = new Button("First Button");
        b1.addActionListener(this);
        buttonPanel.add(b1, "first Button");

        b2 = new Button("Second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2, "second Button");

        b3 = new Button("Third Button");
        b3.addActionListener(this);
        buttonPanel.add(b3, "third Button");
    }

    public void actionPerformed(ActionEvent e) {
        buttonCardLayout.next(buttonPanel);
    }
}

RESULT
Thus, the Java applet program demonstrating the CardLayout manager was written successfully. Clicking a button displays the next button in sequence, cycling through all three buttons
