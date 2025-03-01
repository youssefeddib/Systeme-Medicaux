package Servlet;

import DAO.RendezvousDAO;
import Model.RendezvousModel;
import Model.PatientModel;
import javax.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@WebServlet("/RendezvousServlet")
public class RendezvousServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        PatientModel patient = (PatientModel) session.getAttribute("patient");

        if (patient == null) {
            response.sendRedirect("connexion.jsp");
            return;
        }

        RendezvousDAO dao = new RendezvousDAO();
        List<RendezvousModel> rendezvous = dao.getRendezvousByPatientId(patient.getId());
        request.setAttribute("rendezvous", rendezvous);
        request.getRequestDispatcher("rendezvous.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int patientId = Integer.parseInt(request.getParameter("patientId"));
        Date date = Date.valueOf(request.getParameter("date"));
        Time heure = Time.valueOf(request.getParameter("heure") + ":00");
        String motif = request.getParameter("motif");

        RendezvousDAO dao = new RendezvousDAO();
        dao.ajouterRendezvous(patientId, date, heure, motif);

        response.sendRedirect("RendezvousServlet");
    }
}

