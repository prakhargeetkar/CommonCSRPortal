
package commoncsrportal.controller;

import commoncsrportal.dao.CommentDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import commoncsrportal.dto.CommentDTO;

public class CommentControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String comment=request.getParameter("comment");
        boolean result;
        RequestDispatcher rd=null;
        try
        {
               CommentDTO cm=new CommentDTO();
               cm.setEmail(email);
               cm.setUsername(username);
               cm.setComment(comment);
               result=CommentDAO.registerComment(cm);
            request.setAttribute("result",result);
            System.out.println("Result is:"+result);
            rd=request.getRequestDispatcher("commentresponse.jsp");
        }
        catch(Exception e)
        {
            request.setAttribute("exception",e);
            rd=request.getRequestDispatcher("showexception.jsp");
            System.out.println("Exception from Model:");
            e.printStackTrace();
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
