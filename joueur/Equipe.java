package joueur;

public class Equipe {
    private int id_joueur;
    private String nom;

    public Equipe(int id_joueur, String nom) {
        setId_joueur(id_joueur);
        setNom(nom);
    }

    // Getters and setters
    public int getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
