package Servlet;
import DAO.MedecinDAO;
import jakarta.servlet.annotation.WebServlet;
import Model.MedecinModel;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/medecins")
public class MedecinServlet extends HttpServlet {
    private MedecinDAO medecinDAO;

    public void init() {
        medecinDAO = new MedecinDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<MedecinModel> medecins = medecinDAO.getMedecins();
        request.setAttribute("medecins", medecins);
        request.getRequestDispatcher("medecin.jsp").forward(request, response);
    }
}
