$(function() {
    $("form").submit(function(event) {
        event.preventDefault();
 
        var a = $("#a").val();
        var b = $("#b").val();
        var result = parseInt(a) + parseInt(b);
 
        $("#result").val(result);
    });
});