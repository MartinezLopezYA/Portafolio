<?php
require_once('conecta.php');
$usu = $_POST['usuario'];
$cla = $_POST['clave'];

$SQL = $conn->query("SELECT COUNT(*) FROM usuarios WHERE id_usuario ='$usu' AND clave='$cla'");
$fila = $SQL->fetchColumn();

if($fila>0){
    header("location:inicio.html");
}else{
    echo "Usuario no registrado o error en usuario y clave";
}
?>