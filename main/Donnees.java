package main;

import java.sql.ResultSet;
import java.util.Vector;
import base.*;
import joueur.*;

public class Donnees {
    
    public Donnees(Vector v, String table, String req, Connexion connexion){
        Vector res = v;
        int pos = 50;
        int n_colone = connexion.nombre_colone(table);
        ResultSet result = connexion.mandefa_maka(req);
        // System.out.println(result);
        boolean connect_ve = connexion.teste_connect();
        // System.out.println(n_colone);
        // int n_colone = connexion.nombre_colone("")
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
                            position(j, pos);
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
    }
    public void  position(Joueur j, int p){
        int x = 0;
        int y = 0;
                if ( j.getId_place() == 1) {
                    x = 60;
                    y = 250;
                    j.x = x;
                    j.y = y;
                }
                else if (j.getId_place() == 2) {
                    x = 80;
                    y = 200 + p;
                    j.x = x;
                    j.y = y;
                    p+=100;
                }
                else if (j.getId_place() == 3) {
                    x = 100;
                    y = 200 + p;
                    j.x = x;
                    j.y = y;
                    p+=100;
                }
                else if (j.getId_place() == 4) {
                    x = 130;
                    y = 200 + p;
                    j.x = x;
                    j.y = y;
                    p+=100;
                }
                else if (j.getId_place() == 5) {
                    x = 170;
                    y = 200 + p;
                    j.x = x;
                    j.y = y;
                    p+=100;
                }
                
    
            
            
        }
    // }
}
