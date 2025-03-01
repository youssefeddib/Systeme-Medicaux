package Model;

public class PatientModel {
    private int id;
    private String nom;
    private String email;
    private String telephone;

    public PatientModel(int id, String nom, String email,String telephone) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
    }

    public PatientModel() {


    }

    public PatientModel(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }

    public void setId(int id) {
        this.id = id;
    }



    // Setter pour le nom
    public void setNom(String nom) {
        this.nom = nom;
    }



    // Setter pour l'email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter pour le téléphone


    // Setter pour le téléphone
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

