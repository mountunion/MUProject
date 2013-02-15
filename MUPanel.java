// A nice UMU project with sensible defaults 
// Hacked together with love by Kyle Dreger
// Version: 1.0.0
// URL: github.com/dreger/mu-project

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MUPanel extends JPanel implements ActionListener{
    String windowTitle = "Your Java Program";
    JButton demoButton = new JButton("Click me!");
    JLabel defaultLabel = new JLabel("Code is poetry.");
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName(windowTitle);
        setBackground(Color.decode("#fafafa"));

        // Remove the next three lines to clear the JPanel
        defaultLabel.setBounds(50, 50, 200, 100);
        defaultLabel.setFont(new Font("Georgia", Font.PLAIN, 35));
        this.add(defaultLabel);

        // A demo button which, when clicked, outputs to the console
        demoButton.setBounds(50, 150, 200, 100);
        demoButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        demoButton.addActionListener(this);
        this.add(demoButton);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);      
    } 

    // Using an IF statement to determine the source of the event
    // allows us to have cleaner code when you start adding other
    // elements to the panel. 
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source.equals(demoButton)) {
            System.out.println("demoButton was clicked!");
        }
    }

    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){ new MUPanel().frame(); }
} // end class
