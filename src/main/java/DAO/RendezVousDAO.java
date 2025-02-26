package DAO;

import Model.RendezVousModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RendezVousDAO {

    public void ajouterRendezVous(RendezVousModel rendezVous) {
        String sql = "INSERT INTO rendezvous (date, heure, motif, statut) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(rendezVous.getDate().getTime()));
            stmt.setTime(2, rendezVous.getHeure());
            stmt.setString(3, rendezVous.getMotif());
            stmt.setString(4, rendezVous.getStatut());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<RendezVousModel> getRendezVous() {
        List<RendezVousModel> liste = new ArrayList<>();
        String sql = "SELECT * FROM rendezvous";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                liste.add(new RendezVousModel(
                        rs.getInt("id"),
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

    public void supprimerRendezVous(int id) {
        String sql = "DELETE FROM rendezvous WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
