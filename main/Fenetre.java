package main;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Fenetre() {
        this.setTitle("Terrain");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dessin dessin = new Dessin();
        this.add(dessin);

        this.setVisible(true);
    }

}