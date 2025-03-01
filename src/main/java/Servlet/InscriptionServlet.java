package Servlet;

import DAO.PatientDAO;
import javax.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String password = request.getParameter("password");

        PatientDAO patientDAO = new PatientDAO();
        boolean success = patientDAO.registerPatient(nom, email, telephone, password);

        if (success) {
            response.sendRedirect("connexion.jsp");
        } else {
            request.setAttribute("errorMessage", "Erreur lors de l'inscription.");
            request.getRequestDispatcher("inscription.jsp").forward(request, response);
        }
    }
}
