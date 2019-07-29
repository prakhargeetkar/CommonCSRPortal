/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commoncsrportal.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import commoncsrportal.dao.RegisterDAO;
import commoncsrportal.dto.UserDTO;

public class RegisterControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String password=request.getParameter("password");      
        String usertype=request.getParameter("usertype");
        RequestDispatcher rd=null;
        try
        {
            boolean userFound=RegisterDAO.searchUser(email);
            boolean result=false;
            if(!userFound)
            {
               UserDTO user=new UserDTO();
               user.setEmail(email);
               user.setUsername(username);
               user.setPassword(password);
               user.setUsertype(usertype);
               result=RegisterDAO.registerUser(user);
            }
            request.setAttribute("result",result);
            request.setAttribute("userFound",userFound);
            System.out.println("Result is:"+result);
            rd=request.getRequestDispatcher("registerresponse.jsp");
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
