/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author studentadmin
 */
public class ServletHeaders extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String title = "Servlet Example";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><link rel='stylesheet' href='styles.css'>");
            out.println("<style>");
            out.println("body{color: #fffcf9; font-size:25px;}");
            out.println("td{border: 2px solid black; padding: 15px;}");
            out.println("th{border: 2px solid black;}");
            out.println("</style>");
            out.println("<title>Header Information</title>");      
            out.println("</head>");                 
            out.println("<body>");
            out.println("<center>");
            out.println("<center><h1 id='heading'>Servlet Headers</h1></center>");
            out.println("<table>");
            out.println("<tr><th id='thead'>Header Name</th><th id='thead'>Header Value</th></tr>");
            out.println("<tr><td>request method</td><td>" + request.getMethod() + "</td></tr>");
            out.println("<tr><td>request URI</td><td>" + request.getRequestURI() + "</td></tr>");
            out.println("<tr><td>Servlet path</td><td>" + request.getServletPath() + "</td></tr>");
            out.println("<tr><td>request Protocol</td><td>" + request.getProtocol() + "</td></tr>");
           
            Enumeration headernames = request.getHeaderNames();
            while (headernames.hasMoreElements()) {
                String headerName = (String) headernames.nextElement();
                out.println("<tr><td>" + headerName + "</td><td>" + request.getHeader(headerName) + "</td></tr>");
            }    
            out.println("</table>");
            out.println("</center>");
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
