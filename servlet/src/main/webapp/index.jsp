<!DOCTYPE html>
<html lang="en">
<head>
    <title>SO question 4112686</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script>
        $(document).ready(function() {                       
            $('#somebutton').click(function() {               
                $.get('GetServlet', function(responseText) { 
                    $('#somediv').text(responseText);        
                });
            });
        });


        $("#somebutton").click(function(){
         $.ajax({
            url:'GetServlet',
            data:{name:'abc'},
            type:'get',
            cache:false,
            success:function(data){
               alert(data);
               $('#somediv').text(responseText); 
            },
            error:function(){
              alert('error');
            }
         }
    );
}
);
    </script>
</head>
<body>

    <button id="somebutton">press here</button>
    <div id="somediv"> </div>
    </body>