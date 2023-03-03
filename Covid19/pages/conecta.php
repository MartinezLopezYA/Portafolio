<?php
//Definición de variables de acceso a db
$servername = "localhost";
$username = "root";
$password = "";
//PDO PHP Data Object
try {
    //code...
    //SQL: SELECT QUERY LANGUAGE
    $conn = new PDO("mysql:host=$servername", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $SQL ="CREATE DATABASE IF NOT EXISTS dbcovid19;
    USE dbcovid19;
    CREATE TABLE IF NOT EXISTS usuarios(
        id_usuario VARCHAR(10) NOT NULL PRIMARY KEY,
        nom_usuario VARCHAR(30) NOT NULL,
        ape_usuario VARCHAR(30) NOT NULL,
        clave VARCHAR(20) NOT NULL,
        fecha_nacimiento DATE
    );

    INSERT INTO usuarios(id_usuario, nom_usuario, ape_usuario, clave, fecha_nacimiento)
    VALUES ('camilo', 'Camilo', 'Garzon', 'camilo2020', '1998-07-28');

    ";
    $conn->exec($SQL);
} catch (PDOException $error) {
    //throw $th;
    echo $SQL."<br>".$error->getMessage();
}
?>