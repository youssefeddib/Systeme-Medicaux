package Servlet;

import DAO.DatabaseConnection;
import Model.PatientModel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM utilisateur WHERE email = ? AND Mot_de_passe = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Création de l'objet PatientModel
                PatientModel patient = new PatientModel(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("email")
                );

                HttpSession session = request.getSession();
                session.setAttribute("patient", patient);

                response.sendRedirect("Patient.jsp");
            } else {
                request.setAttribute("error", "Email ou mot de passe incorrect !");
                request.getRequestDispatcher("Connexion.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
