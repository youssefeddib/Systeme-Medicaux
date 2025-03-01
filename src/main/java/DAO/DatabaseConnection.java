package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/systemmedicaux";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Charger le driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Essayer de se connecter à la base de données
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur : Driver MySQL non trouvé. Assurez-vous que le fichier JAR est bien ajouté au projet.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données. Vérifiez les paramètres de connexion.");
            e.printStackTrace();
        }
        // Retourner la connexion (peut être null si la connexion échoue)
        return con;
    }
}
