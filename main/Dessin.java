package main;
import javax.swing.*;


import base.*;
import joueur.Equipe;
import joueur.Joueur;
import joueur.Remplacant;

import java.awt.*;
import java.sql.ResultSet;
import java.util.Vector;
public class Dessin extends JPanel {

    Connexion connexion;
    public Vector v_joueur;
    public Dessin(Connexion connexion){
        this.connexion = connexion;
        Ecouteur ecoute = new Ecouteur(this);
        this.addMouseListener(ecoute);
        this.addKeyListener(ecoute);
        
    }

//--------------------------------------------
    public Vector envoie_recupere(String req, String table){
        Vector res = new Vector();
        Donnees d = new Donnees(res, table, req, this.connexion);
        if (table.equals("JOUEURS")) {
            this.v_joueur = res;
        }
        return res;
    }

    public void envoie(String req){
        ResultSet res = null;
        connexion.mandefa(req);
    }
//--------------------------------------------

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
        

        Vector v = envoie_recupere("select * from joueurs", "JOUEURS");

        for (int i = 0; i < v.size(); i++) {
            
            Joueur j = ((Joueur)v.get(i));
            if (j.getId_equipe() == 1) {
                System.out.println(j.getNom());
                g.setColor(Color.black);
                System.out.println(j.x);
                g.fillOval(j.x, j.y, 20, 20);
                
            }
        }

        Button b = new Button("Tirer");
        b.addActionListener(l ->{
            System.out.println("bbbbbbb");
        });
        b.setSize(50, 30);
        add(b);
    }
}





