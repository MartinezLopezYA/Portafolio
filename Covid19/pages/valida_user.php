<?php

require_once('conecta.php');

if (isset($_POST['id'])) {


    $id = $_POST['id'];


    $consulta = $conn->prepare("SELECT COUNT(id_usuario) FROM usuarios WHERE id_usuario = '$id'");
    $consulta->execute();
    $num_rows = $consulta->fetchColumn();


    if ($num_rows == 1) {

        echo '<div><strong>Oh no!</strong> Nombre de usuario no disponible.</div>';

    } else {

        echo '<div><strong>Enhorabuena!</strong> Usuario disponible.</div>';

    }
    
} 

?>

