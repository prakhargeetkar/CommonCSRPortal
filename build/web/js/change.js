$(document).ready(function(){
  var log=sessionStorage.getItem('status');
  if(log!==null)
  {
     $('#login').html('Logout');
     document.getElementById("login").setAttribute("href","LoginControllerServlet?logout=logout");
  }
  $('#login').click(function(){
        
      if(document.getElementById("login").innerHTML==='Logout'){
            alert("it's ok");  
          $('#login').html('Login');
      document.getElementById("login").setAttribute("href","index.html");
      sessionStorage.removeItem('status');
      return;
  }
  });
  
  
});

