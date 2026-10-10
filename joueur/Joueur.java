package joueur;

public class Joueur {
    private String nom;
    private int numero;
    private String place;

    public Joueur(String nom, int numero, String place) {
        setNom(nom);
        setNumero(numero);
        setPlace(place);
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public String getPlace() {
        return place;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPlace(String place) {
        this.place = place;
    }
}

