<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Connexion - Système Médical</title>
    <style>
        /* Style global pour le corps de la page */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: url('https://images.pexels.com/photos/5726799/pexels-photo-5726799.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1') no-repeat center center fixed;
            background-size: cover;
            color: #fff;
        }

        .content-wrapper {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: rgba(0, 0, 0, 0.5);
        }

        .container {
            text-align: center;
            background: rgba(255, 255, 255, 0.8);
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

        .btn-primary {
            background-color: #007bff;
            color: white;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            transform: scale(1.05);
        }

        .btn-secondary {
            background-color: #28a745;
            color: white;
        }

        .btn-secondary:hover {
            background-color: #218838;
            transform: scale(1.05);
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 30px;
            background-color: #007bff;
            color: white;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="content-wrapper">
        <div class="container">
            <h2>Se Connecter</h2>
            <form action="loginAction.jsp" method="POST">
                <input type="text" name="username" placeholder="Nom d'utilisateur" required><br>
                <input type="password" name="password" placeholder="Mot de passe" required><br>
                <input type="submit" value="Se Connecter">
            </form>
            <p><a href="Inscription.jsp" class="btn btn-secondary">S'inscrire</a></p>
        </div>
    </div>
</body>
</html>