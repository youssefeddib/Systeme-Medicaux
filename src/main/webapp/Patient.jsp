<%@ page import="java.util.List, Model.PatientModel" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Gestion des Patients</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* Style de fond */
        body {
            background-image: url('https://i.pinimg.com/736x/49/74/4a/49744aaf943c929ba87357f8fd8f59d3.jpg'); /* Image de fond */
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
            font-family: Arial, sans-serif;
        }

        /* Conteneur principal */
        .container {
            background: rgba(255, 255, 255, 0.9); /* Fond semi-transparent */
            padding: 30px;
            border-radius: 10px;
            margin-top: 50px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        /* Boutons stylés */
        .btn-add {
            background-color: #28a745;
            color: white;
        }
        .btn-add:hover {
            background-color: #218838;
        }
        .btn-delete {
            background-color: #dc3545;
            color: white;
        }
        .btn-delete:hover {
            background-color: #c82333;
        }

        /* Style du tableau */
        table {
            background: white;
        }

        /* Titre centré */
        h2 {
            text-align: center;
            font-weight: bold;
            color: #333;
        }
    </style>
</head>
<body>

<div class="container">
    <h2 class="my-4">Espace Patient</h2>

    <!-- Formulaire d'ajout de patient -->
    <div class="card p-4 mb-4 shadow">
        <h5 class="text-center">Ajouter Votre Formations</h5>
        <form action="PatientServlet" method="POST" class="row g-3">
            <div class="col-md-4">
                <input type="text" class="form-control" name="nom" placeholder="Nom" required>
            </div>
            <div class="col-md-4">
                <input type="email" class="form-control" name="email" placeholder="Email" required>
            </div>
            <div class="col-md-3">
                <input type="text" class="form-control" name="telephone" placeholder="Téléphone" required>
            </div>
            <div class="col-md-1">
                <button type="submit" class="btn btn-add w-100">Ajouter</button>
            </div>
        </form>
    </div>

    <!-- Table des patients -->
    <div class="table-responsive">
        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Nom</th>
                    <th>Email</th>
                    <th>Téléphone</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<PatientModel> patients = (List<PatientModel>) request.getAttribute("patients");
                    if (patients != null && !patients.isEmpty()) {
                        for (PatientModel p : patients) {
                %>
                <tr>
                    <td><%= p.getId() %></td>
                    <td><%= p.getNom() %></td>
                    <td><%= p.getEmail() %></td>
                    <td><%= p.getTelephone() %></td>
                    <td>
                        <form action="PatientServlet" method="POST" onsubmit="return confirm('Voulez-vous supprimer ce patient ?');">
                            <input type="hidden" name="id" value="<%= p.getId() %>">
                            <button type="submit" class="btn btn-delete btn-sm">Supprimer</button>
                        </form>
                    </td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="5" class="text-center text-muted">Aucun patient trouvé.</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
