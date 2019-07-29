var username,email,password,password2,usertype;
$(document).ready(function()
{
    
        $("#regbtn").click(function(){
            connect();
        });
 });
 function validate(){
     
    username=$("#username").val();
    email=$("#email").val();
    password=$("#password").val();
    password2=$("#password2").val();
    usertype=$("#usertype").val();
    var status=true;
    if(username==="")
    {
        $("#sp1").html("*Username Reqd!").css("color","red");
        status=false;
    }
     if(email==="")
    {
        $("#sp2").html("*Email required!").css("color","red");
        status=false;
    }
    if(password==="")
    {
        $("#sp3").html("*Password Reqd!").css("color","red");
        status=false;
    }
    if(password2==="")
    {
        $("#sp4").html("*Password Reqd!").css("color","red");
        status=false;
    }
     if(usertype==="")
    {
        $("#sp5").html("*Usertype required!").css("color","red");
        status=false;
    }
    if(password!==password2)
    {
       $("#regresult").css("color","red");
       $("#regresult").html("Password did not matched....!");
       status=false;
    }
    $("#sp1").fadeIn();
    $("#sp2").fadeIn();
    $("#sp3").fadeIn();
    $("#sp4").fadeIn();
     $("#sp5").fadeIn();
     $("#sp5").fadeOut(4000);
    $("#sp1").fadeOut(4000);
    $("#sp2").fadeOut(4000);
    $("#sp3").fadeOut(4000);
    $("#sp4").fadeOut(4000);
     $("#sp5").fadeOut(4000);
     return status;
}
function cleartext()
{
    $("#username").text("");
    $("#email").text("");
    $("#password").text("");
    $("#password2").text("");
    $("#usertype").text("");
    
}
function connect()
{
   if(!validate())
   {
       return;
   }
   var mydata={username:username,email:email,password:password,usertype:usertype};
   var request=$.post("RegisterControllerServlet",mydata,processresponse);
   request.error(handleError);
}
function processresponse(responseText)
{
     var resp=responseText;
     resp=resp.trim();    
     if(resp==="uap")
     {
         alert("inside error");
         $("#regresult").css("color","red");
         $("#regresult").html("Sorry! the user is already present!");
 }     
     else if(resp==="success")
     {
         $("#regresult").css("color","green");
         $("#regresult").html("Registration Successful!You can now Login");
     }
     else if(resp==="failure")
     {
         alert("inside else:"+resp);
         $("#regresult").css("color","red");
         $("#regresult").html("Registration Failed!Try Again");
     }
     else
     {
          $("#regresult").html("Some error occurred at the server.Try Later");
        
     }
 }
function handleError(xhr,textStatus)
{
         if(textStatus==='error')
         {
            $("#regresult").html("Error is "+xhr.status);
         }
}
function redirectuser()
{
         window.location="index.html";
}
