package Model;

import java.sql.Date;
import java.sql.Time;

public class RendezvousModel {
    private int id;
    private int patientId;
    private Date date;
    private Time heure;
    private String motif;
    private String statut;

    public RendezvousModel(int id, int patientId, Date date, Time heure, String motif, String statut) {
        this.id = id;
        this.patientId = patientId;
        this.date = date;
        this.heure = heure;
        this.motif = motif;
        this.statut = statut;
    }

    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public Date getDate() { return date; }
    public Time getHeure() { return heure; }
    public String getMotif() { return motif; }
    public String getStatut() { return statut; }
}

