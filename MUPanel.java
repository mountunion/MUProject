// A nice UMU project with sensible defaults 
// Hacked together with love by Kyle Dreger
// Version: 1.0.0
// URL: github.com/dreger/mu-project

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MUPanel extends Frame implements ActionListener{
    String windowTitle = "Your Java Program";
    JLabel demoLabel;
    JButton demoJButton;
    DregerButton demoDregerButton, demoDregerButton2, demoDregerButton3;
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName(windowTitle);
        setBackground(Color.decode("#fafafa"));

        // Remove the following lines to clear the JPanel
        JLabel defaultLabel = new JLabel("Code is poetry.");
        defaultLabel.setBounds(50, 50, 400, 100);
        defaultLabel.setFont(new Font("Georgia", Font.PLAIN, 35));
        this.add(defaultLabel);

        // Demo button which, when clicked, outputs to the console
        demoJButton = new JButton("Click me!");
        demoJButton.setBounds(50, 150, 200, 50);
        demoJButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        demoJButton.addActionListener(this);
        this.add(demoJButton);
        
        // Demo DregerButtons
        demoDregerButton = new DregerButton("I'm BLUE!", Color.decode("#71b3c7"));
        demoDregerButton.setBounds(50, 220, 100, 50);
        demoDregerButton.addActionListener(this);
        this.add(demoDregerButton);
        
        demoDregerButton2 = new DregerButton("I'm RED!", Color.decode("#ce1611"));
        demoDregerButton2.setBounds(170, 220, 100, 50);
        this.add(demoDregerButton2);
        
        demoDregerButton3 = new DregerButton("I'm GREEN!", Color.decode("#8a9b2f"));
        demoDregerButton3.setBounds(290, 220, 120, 50);
        this.add(demoDregerButton3);
    }

    // Using an IF statement to determine the source of the event
    // allows us to have cleaner code when you start adding other
    // elements to the panel. 
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source.equals(demoJButton)) {
            System.out.println("demoJButton was clicked!");
        }
        if (source.equals(demoDregerButton)) {
            System.out.println("demoDregerButton was clicked!");
        }
    }

    public static void main(String args[]){ 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        
        MUPanel muPanel;
        muPanel = new MUPanel();
        muPanel.setBounds(100, 100, 800, 600);
        muPanel.setVisible(true);
    }
} // end class
