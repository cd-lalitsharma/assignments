$(document).ready(function(){ 

    $("form#fullname").submit(function(e){
        e.preventDefault();

        //getting value from form
        var firstName=$("input[name='firstName']").val();
        var lastName=$("input[name='lastName']").val();

        if(firstName==""||lastName==""){
            alert("please provide values");
        }else{

            //removing input field content
            $("input[name='firstName']").val("");
            $("input[name='lastName']").val("");

            $("#loader").css("display","block");

            $.ajax({
                url:'/ajaxCall',
                method:'post',
                data:{firstName:firstName,lastName:lastName},
                success:function(data){

                    $("#fullnamediv>p").html(data);

                    $("#loader").css("display","none");
                }
            });
        }

    });
});