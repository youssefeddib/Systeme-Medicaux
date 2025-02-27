<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil - Système Médical</title>
    <style>
        /* Style global pour le corps de la page */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background:  url('https://i.pinimg.com/736x/88/98/8c/88988cd24f3ea6644320b91056e3feef.jpg') no-repeat center center fixed;
            background-size: cover;
            color: #fff;
        }

        /* Centrage du contenu */
        .content-wrapper {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: rgba(0, 0, 0, 0.5); /* Ombre légère pour améliorer la lisibilité */
        }

        /* Conteneur principal du contenu */
        .container {
            text-align: center;
            background: rgba(255, 255, 255, 0.8); /* Fond semi-transparent pour le conteneur */
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
            width: 100%;
            max-width: 500px;
        }

        h2 {
            font-size: 36px;
            margin-bottom: 20px;
            color: #333;
        }

        p {
            font-size: 18px;
            margin-bottom: 30px;
            color: #555;
        }

        /* Style des boutons */
        .btn {
            display: inline-block;
            width: 200px;
            padding: 12px;
            font-size: 18px;
            text-decoration: none;
            border-radius: 30px;
            margin: 10px 0;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        /* Bouton de connexion */
        .btn-primary {
            background-color: #007bff;
            color: white;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            transform: scale(1.05);
        }

        /* Bouton d'inscription */
        .btn-success {
            background-color: #28a745;
            color: white;
        }

        .btn-success:hover {
            background-color: #218838;
            transform: scale(1.05);
        }

        /* Réactivité sur les petites tailles d'écran */
        @media screen and (max-width: 600px) {
            h2 {
                font-size: 28px;
            }

            .btn {
                width: 180px;
                font-size: 16px;
            }
        }
    </style>
</head>
<body>
    <div class="content-wrapper">
        <div class="container">
            <h2>Bienvenue sur le Système Médical</h2>
            <p>Veuillez vous connecter ou vous inscrire pour accéder à la gestion des patients, rendez-vous et médecins.</p>
            <a href="Conexion.jsp" class="btn btn-primary">Se Connecter</a>
            <a href="Inscription.jsp" class="btn btn-success">S'inscrire</a>
        </div>
    </div>
</body>
</html>
