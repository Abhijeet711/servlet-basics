/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhi
 */
public class demohidden extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String n = request.getParameter("t1");
        String em = request.getParameter("t2");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><link rel=\"stylesheet\" href=\"styles.css\">");
            out.println("<title>Servlet demohidden</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet demohidden at " + request.getContextPath() + "</h1>");
            out.println("<br><fieldset><center>Your name displayed in servlet1(demohidden) is: " + n + "<br><br>");
            out.println("Your email displayed in servlet1(demohidden) is: " + em + "<br><br>");
            out.println("<form action='showhidden' method='post'>");
            out.println("<input type='hidden' name='t1' value="+n+">");
            out.println("<input type='hidden' name='t2' value="+em+">");
            out.println("Enter your country:&nbsp;&nbsp;&nbsp;<input id='intext' autocomplete=off required type=\"text\" name=\"t3\"><br><br>");
            out.println("<input id='srbtn' type='submit' value='Submit'>");
            out.println("<input id='srbtn' type='reset' value='Clear Form'></fieldset></form></center>");
            out.println("</body>");
            out.println("</html>");
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
