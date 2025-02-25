package Model;

public class MedecinModel {
    private int id;
    private String nom;
    private String specialite;

    public MedecinModel(int id, String nom, String specialite) {
        this.id = id;
        this.nom = nom;
        this.specialite = specialite;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getSpecialite() { return specialite; }

    public void setNom(String nom) { this.nom = nom; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }
}
