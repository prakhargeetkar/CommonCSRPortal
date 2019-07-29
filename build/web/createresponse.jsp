<%
   boolean result=(Boolean)request.getAttribute("result");
    if(result==false)
    {
        out.println("failure");
    }
    else
    {
        out.println("success");
    }
%>