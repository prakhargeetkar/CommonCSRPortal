
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var eventname,eventdate,eventtime,image,description,loc;
$(document).ready(function()
{
        $("#createbtn").click(function(){
            connect();
        });
});
function validate(){
    eventname=$("#eventname").val();
    eventdate=$("#eventdate").val();
    eventtime=$("#eventtime").val();
    image1=$("#image").val();
    var arr=image1.split("\\");
    image=arr[arr.length-1];
    alert(image);
    description=$("#description").val();
    loc=$("#location").val();
    var status=true;
    if(eventname==="")
    {
        $("#sp1").html("*eventname Reqd!").css("color","red");
        status=false;
    }
     if(eventdate==="")
    {
        $("#sp2").html("*eventdate required!").css("color","red");
        status=false;
    }
    if(eventtime==="")
    {
        $("#sp3").html("*eventtime Reqd!").css("color","red");
        status=false;
    }
     if(image==="")
    {
        $("#sp4").html("*image required!").css("color","red");
        status=false;
    }
     if(description==="")
    {
        $("#sp5").html("*description required!").css("color","red");
        status=false;
    }
     if(location==="")
    {
        $("#sp6").html("*location required!").css("color","red");
        status=false;
    }
    $("#sp1").fadeIn();
    $("#sp2").fadeIn();
    $("#sp3").fadeIn();
    $("#sp4").fadeIn();
    $("#sp5").fadeIn();
    $("#sp6").fadeIn();
    $("#sp1").fadeOut(4000);
    $("#sp2").fadeOut(4000);
    $("#sp3").fadeOut(4000);
    $("#sp4").fadeOut(4000);
    $("#sp5").fadeOut(4000);
    $("#sp6").fadeOut(4000);
    return status;
}
function cleartext()
{
    $("#eventname").text("");
    $("#eventdate").text("");
    $("#eventtime").text("");
    $("#image").text("");
    $("#description").text("");
    $("#location").text("");
}
function connect()
{
   if(!validate())
   {
       return;
   }
   var mydata={eventname:eventname,eventdate:eventdate,eventtime:eventtime,image:image,description:description,loc:loc};
   var request=$.post("CreateControllerServlet",mydata,processresponse);
   //alert("ggg");
    request.error(handleError);
   }
function processresponse(responseText)
{
     var resp=responseText;
     resp=resp.trim();    
      if(resp==="success")
     {
         $("#createresult").css("color","green");
         $("#createresult").html("Event Creation Successful..");
     }
     else if(resp==="failure")
     {
         alert("inside else:"+resp);
         $("#createresult").css("color","red");
         $("#createresult").html("Event Creation Failed!Try Again");
     }
     else
     {
          $("#createresult").html("Some error occurred at the server.Try Later");
     }
 }
function handleError(xhr,textStatus)
{
         if(textStatus==='error')
         {
            $("#createresult").html("Error is "+xhr.status);
         }
}
function redirectuser()
{
         window.location="index.html";
}
