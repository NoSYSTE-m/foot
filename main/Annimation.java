package main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import joueur.Joueur;

public class Annimation {
    public Graphics g;
    public Ballon ball;
    public Joueur j;
    public Annimation(Graphics g, Joueur j, Ballon ball){
        this.g = g;
        this.ball = ball;
        this.j = j;
    }
    public void joueur_vers_ball(Joueur j){
        if (Math.abs(j.x - ball.x) > 10 && Math.abs(j.y - ball.y) > 10) {
            j.tirer();
        }
        else{
            try {
                Timer timer = new Timer(50, new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        j.x --;
                    }
                });
                timer.start();
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
    public void vers(int x, int y){

    }
}
