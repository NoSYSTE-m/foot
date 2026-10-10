package main;
import javax.swing.*;
import java.awt.*;
public class Dessin extends JPanel {
    // @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        // Dessiner le terrain de football
        g.setColor(Color.GREEN);
        g.fillRect(50, 50, 700, 500); // Terrain

        g.setColor(Color.WHITE);
        g.drawRect(50, 50, 700, 500); // Bordure du terrain

        // Ligne médiane
        g.drawLine(380, 50, 380, 550);

        // Cercle central
        g.drawOval(330, 250, 100, 100);

        // Surface de réparation gauche
        g.drawRect(50, 230, 90, 120);;

        // Surface de réparation droite
        g.drawRect(660, 230, 90, 120);
        
        Ecouteur ecoute = new Ecouteur(this);
        this.addMouseListener(ecoute);
    }
    
}
