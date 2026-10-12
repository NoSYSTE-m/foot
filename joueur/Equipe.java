package joueur;

public class Equipe {
    private int id_equipe;
    private String nom_equipe;
    
    public int getId_equipe() {
        return id_equipe;
    }
    
    public void setId_equipe(int id_equipe) {
        this.id_equipe = id_equipe;
    }
    
    // Getters and setters
    public String getNom_equipe() {
        return nom_equipe;
    }
    
    public void setNom_equipe(String nom_equipe) {
        this.nom_equipe = nom_equipe;
    }


    public Equipe(int id_equipe, String nom) {
        setId_equipe(id_equipe);
        setNom_equipe(nom);
    }
}
