package joueur;

public class Joueur {
    private int id;
    private String nom;
    private String prenom;
    private int numero;
    private int id_place;
    private int id_equipe;
    private int age;
    public int x;
    public int y;

    public int getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(int id_equipe) {
        this.id_equipe = id_equipe;
    }

    public int getId_place() {
        return id_place;
    }

    public void setId_place(int id_place) {
        this.id_place = id_place;
    }
    

    
    public Joueur(){};
    
    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Joueur(int id, String nom, String prenome, int numero, int id_place, int id_equipe, int age) {
        setId(id);
        setNom(nom);
        setPrenom(prenome);
        setNumero(numero);
        setId_place(id_place);
        setId_equipe(id_equipe);
        setAge(age);
        // position();
    }
    
}

