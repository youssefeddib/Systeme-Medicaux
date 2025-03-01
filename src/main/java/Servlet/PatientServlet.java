package Servlet;

import DAO.PatientDAO;
import Model.PatientModel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
    private PatientDAO patientDAO;

    @Override
    public void init() throws ServletException {
        patientDAO = new PatientDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PatientModel> patients = patientDAO.getAllPatients();
        request.setAttribute("patients", patients);
        request.getRequestDispatcher("patients.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");

        PatientModel newPatient = new PatientModel(1, nom, email,telephone);
        patientDAO.addPatient(newPatient);
        response.sendRedirect("PatientServlet");
    }

}