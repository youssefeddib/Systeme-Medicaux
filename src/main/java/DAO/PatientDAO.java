package DAO;
import DAO.DatabaseConnection;
import Model.PatientModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
    public PatientModel getPatientByEmail(String email, String password) {
        PatientModel patient = null;
        String sql = "SELECT * FROM Patient WHERE email = ? AND mot_de_passe = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                patient = new PatientModel(rs.getInt("id"), rs.getString("nom"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patient;
    }

    public boolean registerPatient(String nom, String email, String telephone, String password) {
        String sql = "INSERT INTO Patient (nom, email, telephone, mot_de_passe) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nom);
            ps.setString(2, email);
            ps.setString(3, telephone);
            ps.setString(4, password);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<PatientModel> getAllPatients() {
        List<PatientModel> patients = new ArrayList<>();
        String query = "SELECT * FROM patients"; // استبدل "patients" باسم جدول المرضى في قاعدة بياناتك

        try (PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                PatientModel patient = new PatientModel();
                patient.setId(rs.getInt("id"));
                patient.setNom(rs.getString("nom"));
                patient.setEmail(rs.getString("email"));
                patient.setTelephone(rs.getString("telephone"));
                patients.add(patient);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // يمكنك التعامل مع الأخطاء بشكل أفضل هنا
        }
        return patients;
    }

    // دالة لإضافة مريض جديد إلى قاعدة البيانات
    public boolean addPatient(PatientModel patient) {
        String query = "INSERT INTO patients (nom, email, telephone) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            stmt.setString(1, patient.getNom());
            stmt.setString(2, patient.getEmail());
            stmt.setString(3, patient.getTelephone());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // دالة لحذف مريض من قاعدة البيانات
    public boolean deletePatient(int patientId) {
        String query = "DELETE FROM patients WHERE id = ?";

        try (PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            stmt.setInt(1, patientId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

