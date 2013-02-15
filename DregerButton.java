// Dreger Buttons - to make JButtons suck less
// Hacked together with love by Kyle Dreger
// Version: 1.0.0
// URL: github.com/dreger/mu-project

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class DregerButton extends JButton implements MouseListener{
    Font defaultFont = new Font("Gill Sans MT", Font.BOLD, 15);
    Color textColor = Color.decode("#ffffff");
    Color hoverColor;
   
    public DregerButton(String s, Color bg) {
        s = s.toUpperCase();
        this.setFocusPainted(false);
        this.setText(s);
        this.setBorder(null);
        this.setBackground(bg);
        this.setHoverColor(bg.darker());
        this.setForeground(textColor);
        this.hoverColor = bg.darker();
        this.setFont(defaultFont);
        this.setOpaque(true);
        addMouseListener(this);
    }

    public void setHoverColor(Color color) {
        hoverColor = color; 
    }

    @Override public void mouseClicked(MouseEvent me) {}
    @Override public void mouseReleased(MouseEvent me) {}
    @Override public void mousePressed(MouseEvent me) {}
    
    @Override
    public void mouseEntered(MouseEvent e) { this.setBackground(this.hoverColor); }
    @Override
    public void mouseExited(MouseEvent e) { 
        Color normalState = hoverColor.brighter();
        this.setBackground(normalState); 
    }
}
    