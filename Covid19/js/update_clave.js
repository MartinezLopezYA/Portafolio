$(document).ready(function () {

    $('#id','#clva','#newclv','#confirnewclv').on('blur', function () {

        var id = $(this).val();
        var dataString = 'id =' + id;
        
        $.ajax({

            type: "POST",
            url: "update_clave.php",
            data: dataString,
            success: function (data) {

                $('#result-username').html(data);

            }
        });
    });
});