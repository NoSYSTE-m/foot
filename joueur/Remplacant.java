package joueur;

public class Remplacant{
    private int id_joueur;
    private int id_place;

    public int getId_place() {
        return id_place;
    }
    public void setId_place(int id_place) {
        this.id_place = id_place;
    }
    public int getId_joueur() {
        return id_joueur;
    }
    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }

    public Remplacant(int id_j, int id_p){
        setId_joueur(id_j);
        setId_place(id_p);
    }

}
