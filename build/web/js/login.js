var email,password;
var url;
$(document).ready(function(){
     $("#email").keypress(function(){
            cleartext();
         });
        $("#password").keypress(function(){
             cleartext();
        });
        $("#loginbtn").click(function(){
            connect();
        });
    });
function cleartext()
{
    $("#sp1").text("");
    $("#sp2").text("");
    $("#loginresult").text("");
}
function validate(){
        cleartext();
        email=$("#email").val();
        password=$("#password").val();
        var status=true;
        if(email==="")
        { $("#sp1").text("*Email required").css("color","red");
        status=false;
        }
        if(password==="")
        { $("#sp2").text("*Password required").css("color","red");
        status=false;
        }
            return status;
    }
    function connect(){
        if(validate()===false)
            return;
        
    var data={email:email,password:password};
    var request=$.post("LoginControllerServlet",data,processresponse);
    request.error(handleError);
}
function processresponse(responseText){
    var resp=responseText;
    var pagename;
    resp=resp.trim();
    url=resp;
    if(resp.indexOf("jsessionid")!==-1)
    {
       alert("inside success");      
       $("#loginresult").css("color","green");
       pagename="Home";
       $("#loginresult").html("Login accepted.. Redirecting to the "+pagename+" page..!!");
       
           sessionStorage.setItem('status','loggedin')
      
      // url=resp.split("?",1);
       
       setTimeout(redirectuser,3000);
    }
    else if(resp==="error")
     {
         alert("inside error");
         $("#loginresult").css("color","red");
         $("#loginresult").html("Login Rejected");
     }
     else
     {
         alert("inside else:"+resp);
         $("#loginresult").css("color","red");
         $("#loginresult").html("Some error occurred at the server.Try Later");
     }
}
function handleError(xhr,textStatus)
{
    if(textStatus==='error')
        $("#loginresult").html("Error is "+xhr.status);  
}
function redirectuser()
{
    window.location=url;
}


