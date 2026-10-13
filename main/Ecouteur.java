package main;

import java.awt.event.*;
import java.util.*;

import joueur.Joueur;


public class Ecouteur implements MouseListener, KeyListener{
    private Dessin dessin;
    public Ecouteur(Dessin d){
        setDessin(d);
    }
    void setDessin(Dessin d){
        this.dessin = d;
    }
    Dessin getDessin(){
        return this.dessin;
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("mouseClicked");
        int clic_x = e.getX();
        int clic_y = e.getY();
        System.out.println(clic_x+"  "+clic_y);
        Vector v_joueur = dessin.v_joueur;
        for (int i = 0; i < v_joueur.size(); i++) {
            Joueur j = (Joueur)v_joueur.get(i);
            if ((clic_x >= j.x && clic_x <= (j.x + 20)) && (clic_y >= j.y && clic_y <= (j.y + 20))) {
                System.out.println("cest    jjjjjjj   "+j.getNom());
                dessin.j_cliquer = j;
                break;
            }
        }
    }
    public void mousePressed(MouseEvent e){
        System.out.println("mousePressed");

    }
    public void mouseReleased(MouseEvent e){
        System.out.println("mouseReleased");

    }
    public void mouseEntered(MouseEvent e){
        System.out.println("mouseEntere");
        
    }
    public void mouseExited(MouseEvent e){
        System.out.println("mouseExited");
    }

    public void keyPressed(KeyEvent e){
        System.out.println("keyPressed");

    }
    public void keyReleased(KeyEvent e){
        System.out.println("keyReleased");

    }
    public void keyTyped(KeyEvent e){
        System.out.println("keyTyped");

    }
}
