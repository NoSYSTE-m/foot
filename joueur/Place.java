package joueur;

public class Place {
    private int id_place;
    private String nom_place;

    public String getNom_place() {
        return nom_place;
    }
    public void setNom_place(String nom_place) {
        this.nom_place = nom_place;
    }
    public int getId_place() {
        return id_place;
    }
    public void setId_place(int id_place) {
        this.id_place = id_place;
    }


    public Place(int id_place,  String n_place){
        setId_place(id_place);
        setNom_place(n_place);
    }

}
