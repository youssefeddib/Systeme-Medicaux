package DAO;

import Model.MedecinModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedecinDAO {
    public void ajouterMedecin(MedecinModel medecin) {
        String sql = "INSERT INTO medecin (nom, specialite) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medecin.getNom());
            stmt.setString(2, medecin.getSpecialite());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<MedecinModel> getMedecins() {
        List<MedecinModel> medecins = new ArrayList<>();
        String sql = "SELECT * FROM medecin";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                medecins.add(new MedecinModel(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("specialite")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medecins;
    }
}

