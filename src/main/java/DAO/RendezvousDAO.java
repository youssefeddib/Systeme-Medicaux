package DAO;

import Model.RendezvousModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RendezvousDAO {
    public List<RendezvousModel> getRendezvousByPatientId(int patientId) {
        List<RendezvousModel> liste = new ArrayList<>();
        String sql = "SELECT * FROM Rendezvous WHERE patient_id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                liste.add(new RendezvousModel(
                        rs.getInt("id"),
                        rs.getInt("patient_id"),
                        rs.getDate("date"),
                        rs.getTime("heure"),
                        rs.getString("motif"),
                        rs.getString("statut")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste;
    }

    public boolean ajouterRendezvous(int patientId, Date date, Time heure, String motif) {
        String sql = "INSERT INTO Rendezvous (patient_id, date, heure, motif) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, patientId);
            ps.setDate(2, date);
            ps.setTime(3, heure);
            ps.setString(4, motif);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean mettreAJourStatut(int id, String statut) {
        String sql = "UPDATE Rendezvous SET statut = ? WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, statut);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
