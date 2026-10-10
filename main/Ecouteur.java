package main;

import java.awt.event.*;
import java.util.EventListener;


public class Ecouteur extends MouseAdapter{
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
        
    }
    public void mousePressed(MouseEvent e){
        System.out.println("mousePressed");

    }
    public void mouseReleased(MouseEvent e){
        System.out.println("mouseReleased");

    }
    public void mouseEntere(MouseEvent e){
        System.out.println("mouseEntere");
        
    }
    public void mouseExited(MouseEvent e){
        System.out.println("mouseExited");
    }
    
}
