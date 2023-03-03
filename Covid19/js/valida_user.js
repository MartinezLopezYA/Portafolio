

$(document).ready(function () {
    $('#id').on('blur', function () {

        var id = $(this).val();
        var dataString = 'id=' + id;

        $.ajax({

            type: "POST",
            url: "valida_user.php",
            data: dataString,
            success: function (data) {

                $('#result-username').fadeIn(1000).html(data);

            }
        });
    });
});