package Servlet;
import DAO.RendezVousDAO;
import DAO.RendezVousDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;

import Model.RendezVousModel;
import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rendezvous")
public class RendezVousServlet extends HttpServlet {
    private RendezVousDAO rendezVousDAO;

    public void init() {
        rendezVousDAO = new RendezVousDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<RendezVousModel> liste = rendezVousDAO.getRendezVous();
        request.setAttribute("rendezvous", liste);
        request.getRequestDispatcher("rendezvous.jsp").forward(request, response);
    }
}
