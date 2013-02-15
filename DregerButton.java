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
    Font defaultFont = new Font("Gill Sans MT",Font.BOLD,14);
    Color textColor = Color.decode("#ffffff");
    Color backgroundColor = Color.decode("#000000");
    Color hoverColor = Color.decode("#00aced");
    
    public DregerButton(String s) {
        s = s.toUpperCase();
        this.setFocusPainted(false);
        this.setText(s);
        this.setBorder(null);
        this.setForeground(textColor);
        this.setBackground(backgroundColor);
        this.setFont(defaultFont);
        this.setOpaque(true);
        addMouseListener(this);
    }
    public DregerButton(String s, Color backgroundColor, Color hoverColor) {
        s = s.toUpperCase();
        this.setFocusPainted(false);
        this.setText(s);
        this.setBorder(null);
        this.setHoverColor(hoverColor);
        this.setBackground(backgroundColor);
        this.setFont(defaultFont);
        this.setOpaque(true);
        addMouseListener(this);
    }
    
    public void setBackgroundColor(Color color) {
        backgroundColor = color; 
    }
    public void setHoverColor(Color color) {
        hoverColor = colorSubmitted; 
    }

    @Override public void mouseClicked(MouseEvent me) {}
    @Override public void mouseReleased(MouseEvent me) {}
    @Override public void mousePressed(MouseEvent me) {}
    
    @Override
    public void mouseEntered(MouseEvent e) { 
        if (e.getSource()==this) {  
            this.setBackground(this.hover_color); 
        }
    }
    @Override
    public void mouseExited(MouseEvent e) { 
        if (e.getSource()==this) { 
            this.setBackground(this.backgroundColor); 
        }
    }
}
    