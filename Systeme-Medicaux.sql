CREATE DATABASE systemmedicaux;
USE systemmedicaux;

CREATE TABLE Patient (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telephone VARCHAR(20) NOT NULL
);


CREATE TABLE Rendezvous (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE NOT NULL,
    heure TIME NOT NULL,
    motif VARCHAR(255) NOT NULL,
    statut ENUM('Confirmé', 'Annulé', 'En attente') DEFAULT 'En attente'
);


CREATE TABLE Medecin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    specialite VARCHAR(100) NOT NULL
);

CREATE TABLE User (
id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR (40) NOT NULL,
email VARCHAR (30) NOT NULL,
password VARCHAR (50) NOT NULL
);

CREATE TABLE login (
id INT AUTO_INCREMENT PRIMARY KEY,
email VARCHAR (60) NOT NULL,
password VARCHAR (50)
);

INSERT INTO User (id, username, email, password) VALUES
('hamid', 'hamid@lm.com', '09876543'),
('rachid', 'rachiid@lm.com', '15483659'),
('halima', 'halima@lm.com', '19036192');
SELECT * FROM User;

INSERT INTO login (email, password) values
('hassan@lm.com', '01873482'),
('youssef@lm.com', '01829478'),
('karim@lm.com', '29016743');

INSERT INTO Patient (nom, email, telephone) VALUES
('Alice Dupont', 'alice@example.com', '0612345678'),
('Bob Martin', 'bob@example.com', '0698765432'),
('Charlie Durand', 'charlie@example.com', '0654321987');
SELECT * FROM Patient;


INSERT INTO Rendezvous (date, heure, motif, statut) VALUES
('2024-02-25', '10:30:00', 'Consultation générale', 'Confirmé'),
('2024-02-26', '15:00:00', 'Suivi médical', 'En attente'),
('2024-02-27', '09:00:00', 'Examen de routine', 'Annulé');
SELECT * FROM Rendezvous;


INSERT INTO Medecin (nom, specialite) VALUES
('Dr. Dupont', 'Cardiologie'),
('Dr. Martin', 'Dermatologie'),
('Dr. Durand', 'Gynécologie'),
('Dr. Lefevre', 'Neurologie');
SELECT * FROM Medecin;

