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
import javax.servlet.http.HttpSession;

/**
 *
 * @author studentadmin
 */
public class Home extends HttpServlet {

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
        HttpSession hs = request.getSession(true);
        String email1 = (String) hs.getAttribute("email");
        hs.setAttribute("email2",email1);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            //out.println("<h1>Servlet Home at " + request.getContextPath() + "</h1>");
            out.println("<html><head><title>Home</title><link rel='stylesheet' href='styles.css'><style>td{padding: 20px; font-size:25px;}</style><head>");
            out.println("<body><div><center>");
            out.println("<center><h1 id='heading'>Welcome "+ email1 +"</h1></center>");
            out.println("<table border='1px'><tr><th id='thead'>Sr No.</th><th id='thead'>Practical Name</th></tr>");           
            out.println("<tr><td>1</td><td><a href='textcolor.html'>Web application using HttpServlet demonstrating doGet() method</a></td></tr>");
            out.println("<tr><td>2</td><td><a href='calc.html'>Web application using HttpServlet demonstrating doPost() method</a></td></tr>");
            out.println("<tr><td>3</td><td><a href='ServletHeaders'>Web application to display Http Request Headers</a></td></tr>");
            out.println("<tr><td>4.1</td><td><a href='NewServlet'>Web application to Initialize Parameters using web.xml</a></td></tr>");
            out.println("<tr><td>4.2</td><td><a href='context_param'>Web application to demonstrate Servlet Context Parameters</a></td></tr>");
            out.println("<tr><td>5</td><td><a href='ReqInterface.html'>Web application using Http Servlet Request getParameter() methods</a></td></tr>");
            out.println("<tr><td>6</td><td><a href='PageHitCounter'>Web application to display the page hit counter using session variables</a></td></tr>");
            out.println("<tr><td>7</td><td><a href='urlrewrite.html'>Web application to demonstrate the use of URL Rewriting in session tracking</a></td></tr>");
            out.println("<tr><td>8</td><td><a href='sessioncookies.html'>Web application to demonstrate the use of cookies in session tracking</a></td></tr>");
            out.println("<tr><td>9</td><td><a href='hidden.html'>Web application to demonstrate the use of hidden fields in session tracking</a></td></tr>");
            out.println("<tr><td>10</td><td><a href='LINK'>Web application to display result online, display mark sheet in appropriate format</a></td></tr>");
            out.println("<tr><td>11</td><td><a href='PageRefresh'>Web application to implement page refresh</a></td></tr>");
            out.println("<tr><td>12</td><td><a href='PageRefreshCounter'>Web application to implement auto page refresh counter</a></td></tr>");
            //out.println("<tr><td>PRACTICAL NO</td><td><a href='LINK'>PRACTICAL NAME</td></tr>");
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
