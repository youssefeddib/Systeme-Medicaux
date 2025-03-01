<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List, model.Medecin" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gestion des Médecins</title>
</head>
<body>
    <h2>Liste des Médecins</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Spécialité</th>
        </tr>
        <%
            List<Medecin> medecins = (List<Medecin>) request.getAttribute("medecins");
            if (medecins != null) {
                for (Medecin m : medecins) {
        %>
        <tr>
            <td><%= m.getId() %></td>
            <td><%= m.getNom() %></td>
            <td><%= m.getSpecialite() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>

    <h2>Ajouter un Médecin</h2>
    <form action="medecins" method="post">
        <label>Nom :</label>
        <input type="text" name="nom" required>
        <br>
        <label>Spécialité :</label>
        <input type="text" name="specialite" required>
        <br>
        <input type="submit" value="Ajouter">
    </form>
    <br>
    <a href="index.jsp">Retour à l'accueil</a>
</body>
</html>
