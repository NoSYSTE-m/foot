package main;

import javax.swing.*;

import base.Connexion;

import java.awt.*;

public class Fenetre extends JFrame {
    public Fenetre() {
        this.setTitle("Terrain");
        this.setSize(1000, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Connexion c = new Connexion();
        
        Dessin dessin = new Dessin(c);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.add(dessin);
        dessin.setFocusable(true);
        dessin.requestFocusInWindow();
        this.setVisible(true);
        
    }

}