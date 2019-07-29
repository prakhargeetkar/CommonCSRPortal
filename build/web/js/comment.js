var username,email,comment;
username=$("#username").val();
email=$("#email").val();
comment=$("#comment").val();
$(document).ready(function()
{
        $("#addbtn").click(function(){
            connect();
        });
 });
function connect()
{
   var mydata={username:username,email:email,comment:comment};
   var request=$.post("CommentControllerServlet",mydata,processresponse);
   request.error(handleError);
}
function processresponse(responseText)
{
     var resp=responseText;
     resp=resp.trim();    
     if(resp==="success")
     {
         $("#regresult").css("color","green");
         $("#regresult").html("Your Comment is Successfully Registered!");
     }
     else if(resp==="failure")
     {
         alert("inside else:"+resp);
         $("#regresult").css("color","red");
         $("#regresult").html("Comment registration Failed!Try Again");
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
