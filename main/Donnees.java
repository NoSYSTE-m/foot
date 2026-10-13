package main;

import java.sql.ResultSet;
import java.util.Vector;
import base.*;
import joueur.*;

public class Donnees {
    
    public Donnees(Vector v, String table, String req, Connexion connexion){
        Vector res = v;
        int pos = 50;
        boolean connect_ve = connexion.teste_connect();
        ResultSet result = connexion.mandefa_maka(req);
        connexion.close();
        if (connect_ve) {
            System.out.println("Connecteee");
            if (result == null) {
                System.out.println("Resultat NULL");
            }
            else{
                try {
                    if (table.equals("JOUEURS")) {
                    while (result.next()) {
                            int id_j = result.getInt(1);
                            String nom = result.getString(2);
                            String prenom = result.getString(3);
                            int numero = result.getInt(4);
                            int place_j = result.getInt(5);
                            int equipe_j = result.getInt(6);
                            int age = result.getInt(7);
                            // System.out.println(prenom);
                            Joueur j = new Joueur(id_j, nom, prenom, numero, place_j, equipe_j, age);
                            // System.out.println(j.getNom());
                            // position(j, pos);
                            res.add(j);
                        }
                        System.out.println("fffff");
                        

                    }
                    if (table.equals("PLACES")) {
                        while (result.next()) {
                            int id_place = result.getInt(1);
                            int id_j = result.getInt(2);
                            String nom_place = result.getString(3);
                            Place p = new Place(id_place, nom_place);
                            res.add(p);
                            
                        }
                    }
                    if (table.equals("EQUIPES")) {
                        while (result.next()) {
                            int id_equipe = result.getInt(1);
                            String name_e = result.getString(2);
                            Equipe e = new Equipe(id_equipe, name_e);
                            res.add(e);
                        }
                        
                    }
                    if (table.equals("REMPLACANTS")) {
                        while (result.next()) {
                            int id_j = result.getInt(1);
                            int id_p = result.getInt(2);
                            Remplacant r = new Remplacant(id_j, id_p);
                            res.add(r);
                        }
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            
        }
        else{
            System.out.println("Connection lost");
        }
        // connexion.close();
        positionner(res, 50, 50, 700, 500);
    }
         
            
    //     }
    public void positionner(Vector joueurs, int x0, int y0, int largeur, int hauteur) {
    double[] fraction = {0, 0.08, 0.22, 0.36, 0.46};   // postes 1 à 4

    for (int equipe = 1; equipe <= 2; equipe++) {

        // --- joueurs sur le terrain (postes 1 à 4) ---
        for (int place = 1; place <= 4; place++) {
            Vector ligne = joueursDe(joueurs, equipe, place);
            for (int k = 0; k < ligne.size(); k++) {
                Joueur j = (Joueur) ligne.get(k);
                int x = (int) (largeur * fraction[place]);
                if (equipe == 2) {
                    x = largeur - x;                       // miroir
                }
                j.x = x0 + x;
                j.y = y0 + hauteur * (k + 1) / (ligne.size() + 1);
            }
        }

        // --- remplaçants (poste 5) : sous le terrain ---
        Vector banc = joueursDe(joueurs, equipe, 5);
        int debut = (equipe == 1) ? x0 : x0 + largeur / 2;   // moitié gauche ou droite
        for (int k = 0; k < banc.size(); k++) {
            Joueur j = (Joueur) banc.get(k);
            j.x = debut + (largeur / 2) * (k + 1) / (banc.size() + 1);
            j.y = y0 + hauteur + 40;
        }
        }
        }
        // petite méthode utilitaire : les joueurs d'une équipe à un poste
        private Vector joueursDe(Vector joueurs, int equipe, int place) {
            Vector res = new Vector();
            for (int i = 0; i < joueurs.size(); i++) {
                Joueur j = (Joueur) joueurs.get(i);
                if (j.getId_equipe() == equipe && j.getId_place() == place) {
                    res.add(j);
                }
            }
            return res;
        }
}
