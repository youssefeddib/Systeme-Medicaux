<%@ page import="Model.RendezvousModel, java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<RendezvousModel> rendezvous = (List<RendezvousModel>) request.getAttribute("rendezvous");
%>

<h2>Vos Rendez-vous</h2>

<table border="1">
    <tr>
        <th>Date</th>
        <th>Heure</th>
        <th>Motif</th>
        <th>Statut</th>
    </tr>
    <% for (RendezvousModel rdv : rendezvous) { %>
        <tr>
            <td><%= rdv.getDate() %></td>
            <td><%= rdv.getHeure() %></td>
            <td><%= rdv.getMotif() %></td>
            <td><%= rdv.getStatut() %></td>
        </tr>
    <% } %>
</table>

<h3>Prendre un Rendez-vous</h3>
<form action="RendezvousServlet" method="post">
    <input type="hidden" name="patientId" value="<%= session.getAttribute("patient") != null ? ((Model.PatientModel) session.getAttribute("patient")).getId() : "" %>">
    <input type="date" name="date" required>
    <input type="time" name="heure" required>
    <input type="text" name="motif" placeholder="Motif" required>
    <button type="submit">Ajouter</button>
</form>
