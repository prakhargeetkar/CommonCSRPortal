<%
    boolean result=(Boolean)request.getAttribute("result");
    String email=(String)request.getAttribute("email");
    if(result==true)
    {
        String url="index.html?jsessionid="+session.getId();
        out.println(url);
        HttpSession sess=request.getSession();
        sess.setAttribute("email",email);
    }
    else
            {
               out.println("error");
            }
%>