package Servlet;

import DAO.PatientDAO;
import Model.PatientModel;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.PatientModel;

@WebServlet("/patients")
public class PatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private PatientDAO patientDAO;

    public void init() {
        patientDAO = new PatientDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<PatientModel> patients = patientDAO.getPatients();
        request.setAttribute("patients", patients);
        request.getRequestDispatcher("patient.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");

        if (nom != null && email != null && telephone != null) {
            PatientModel patient = new PatientModel(0, nom, email, telephone);
            patientDAO.ajouterPatient(patient);
        }

        response.sendRedirect("patients"); // Rafraîchir la liste des patients
    }
}
