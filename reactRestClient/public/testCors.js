$(document).ready(function() {
    $.ajax({
        url: "http://pc002:8082/devices/4"
    }).then(function(data, status, jqxhr) {
       $('.dataName').append(data.name);
       console.log(jqxhr);
    });
});