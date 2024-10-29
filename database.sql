CREATE DATABASE paris_airline_db;

CREATE TABLE User (
                      Id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      firstname VARCHAR(255) NOT NULL,
                      lastname VARCHAR(255) NOT NULL,
                      address VARCHAR(255),
                      email VARCHAR(255) UNIQUE NOT NULL,
                      phone VARCHAR(20),
                      birthdate DATE
);

CREATE TABLE Client (
                        Num_Passport VARCHAR(50) PRIMARY KEY,
                        User_Id BIGINT,
                        FOREIGN KEY (User_Id) REFERENCES User(Id)
);

CREATE TABLE Employee (
                          Num_Emp VARCHAR(50) PRIMARY KEY,
                          User_Id BIGINT,
                          FOREIGN KEY (User_Id) REFERENCES User(Id)
);

CREATE TABLE Plane (
                       Id_Plane BIGINT AUTO_INCREMENT PRIMARY KEY,
                       brand VARCHAR(255) NOT NULL,
                       model VARCHAR(255) NOT NULL,
                       manufacturing_year INT NOT NULL
);

CREATE TABLE Airport (
                         Id_Airport BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name_airport VARCHAR(255) NOT NULL,
                         country_airport VARCHAR(255) NOT NULL,
                         city_airport VARCHAR(255) NOT NULL
);

CREATE TABLE Flight (
                        Id_Vol BIGINT AUTO_INCREMENT PRIMARY KEY,
                        ville_depart VARCHAR(255) NOT NULL,
                        ville_arriv VARCHAR(255) NOT NULL,
                        heure_date_depart TIMESTAMP NOT NULL,
                        heure_date_arrivee TIMESTAMP NOT NULL,
                        aeroport_depart BIGINT,
                        aeroport_arriv BIGINT,
                        identifiant_avion BIGINT,
                        nombre_de_place INT NOT NULL,
                        FOREIGN KEY (aeroport_depart) REFERENCES Airport(Id_Airport),
                        FOREIGN KEY (aeroport_arriv) REFERENCES Airport(Id_Airport),
                        FOREIGN KEY (identifiant_avion) REFERENCES Plane(Id_Plane)
);

CREATE TABLE Book (
                      Id_Reservation BIGINT AUTO_INCREMENT PRIMARY KEY,
                      Id_Vol BIGINT,
                      Id_Client VARCHAR(50),
                      FOREIGN KEY (Id_Vol) REFERENCES Flight(Id_Vol),
                      FOREIGN KEY (Id_Client) REFERENCES Client(Num_Passport)
);