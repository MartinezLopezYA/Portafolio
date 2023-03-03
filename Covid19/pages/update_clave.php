<?php

require_once('conecta.php');

if (isset($_POST['id'])) {

    $id = $_POST['id'];
    $clva = $_POST['clave'];
    $newcla = $_POST['newclv'];
    $confinewcla = $_POST['confirnewclv'];

    $consulta = $conn->prepare("SELECT COUNT(id_usuario) FROM usuarios WHERE id_usuario = '$id'");
    $consulta->execute();
    $num_rows = $consulta->fetchColumn();

    if ($num_rows == 1) {

        $SQL = $conn->query(" SELECT * FROM usuarios");
        $result_sql = $SQL->rowCount();
        $data = $SQL->fetch(\PDO::FETCH_ASSOC);

        if($clva == $data['clave']){

            if($newcla == $confinewcla){

                $SQL_UPDT = $conn->prepare("UPDATE usuarios SET clave = '$confinewcla' WHERE id_usuario = '$id' ");
                $SQL_UPDT->execute();

                if($SQL_UPDT){
                    echo 'Clave Actualizada ';
                } else{
                    echo 'Error al actualizar la clave';
                }
            } else{
                echo 'Los datos no coinciden';
            }
        } else{
            echo 'La clave_A no es correcta';
        }
    }else{
        echo 'No existe el id ';
    } 
}
?>