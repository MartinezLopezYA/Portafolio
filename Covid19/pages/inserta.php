<?php

require_once('conecta.php');

// las variables reciben los datos previamente digitados en crear usuario

$id = $_POST['id'];
$firsname = $_POST['nombre'];
$ape = $_POST['apellido'];
$password = $_POST['clave'];
$fecha_nac = $_POST['fecha_nacimiento'];

try {
    //code...
    $SQL = $conn->prepare("INSERT INTO usuarios(id_usuario, nom_usuario, ape_usuario, clave, fecha_nacimiento)
    VALUES (:id_usuario, :nom_usuario, :ape_usuario, :clave, :fecha_nacimiento)");
    $SQL->bindparam(':id_usuario', $id);
    $SQL->bindparam(':nom_usuario', $firsname);
    $SQL->bindparam(':ape_usuario', $ape);
    $SQL->bindparam(':clave', $password);
    $SQL->bindparam(':fecha_nacimiento', $fecha_nac);

    //Excecute
    $SQL->execute(); 
    header("location:inicio.html");
    } catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
        } 
    //Cerrar la sucesion 
$conn = null;
?>