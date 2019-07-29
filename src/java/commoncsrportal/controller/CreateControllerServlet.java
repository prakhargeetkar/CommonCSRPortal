package commoncsrportal.controller;
import commoncsrportal.dao.EventsDAO;
import commoncsrportal.dto.EventDTO;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String eventname=request.getParameter("eventname");
        HttpSession sess=request.getSession();
        String email=(String)sess.getAttribute("email");
        System.out.println(email);
        String date=request.getParameter("eventdate");
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date eventdate;
        java.sql.Date date1 = null;
       try
       {
           eventdate=sdf.parse(date);
           long x=eventdate.getTime();
           date1=new java.sql.Date(x);
       }
       catch(ParseException e)
       {
           System.out.println(e);
           e.printStackTrace();
       }
        String eventtime=request.getParameter("eventtime");      
        String image=request.getParameter("image");
        String description=request.getParameter("description");
        String location=request.getParameter("loc");
        RequestDispatcher rd=null;
        try
        {
               boolean result=false;
               EventDTO cr=new EventDTO();
               cr.setEventname(eventname);
               cr.setDate(date1);
               cr.setTime(eventtime);
               cr.setImage(image);
               cr.setDesc(description);
               cr.setLocation(location);
               cr.setEmail(email);
               System.out.println(email);
               result=EventsDAO.registerEvent(cr);
               request.setAttribute("result",result);
               System.out.println("Result is:"+result);
               rd=request.getRequestDispatcher("createresponse.jsp");
        }
        catch(Exception e)
        {
            request.setAttribute("exception",e);
            rd=request.getRequestDispatcher("showexception.jsp");
            System.out.println("Exception from Model:");
        }
        finally
        {
            rd.forward(request, response);
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
