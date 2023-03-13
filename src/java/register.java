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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author studentadmin
 */
public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String r0 = request.getParameter("fname");
        String r1 = request.getParameter("lname");
        String r2 = request.getParameter("email");
        String r3 = request.getParameter("phone");
        String r4 = request.getParameter("pass");
        String r5 = request.getParameter("gender");
        String r6 = request.getParameter("lang");
        String r7 = request.getParameter("dob");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at " + request.getContextPath() + "</h1>");
            out.println("First Name: " + r0 + "<br>");
            out.println("Last Name: " + r1 + "<br>");
            out.println("Email: " + r2 + "<br>");
            out.println("Phone Number: " + r3 + "<br>");
            out.println("Password: " + r4 + "<br>");
            out.println("Gender: " + r5 + "<br>");
            out.println("Mother Tongue: " + r6 + "<br>");
            out.println("Date of Birth is: " + r7 + "<br>");
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                String iq = "INSERT INTO reg1(fname,lname,email,phone,password,gender,mt,dob) VALUES(?,?,?,?,?,?,?,?);";
                PreparedStatement ps = conn.prepareStatement(iq);
                ps.setString(1,r0);
                ps.setString(2,r1);
                ps.setString(3,r2);
                ps.setString(4,r3);
                ps.setString(5,r4);
                ps.setString(6,r5);
                ps.setString(7,r6);
                ps.setString(8,r7);
                int i = ps.executeUpdate();
                System.out.println("executed: " + i);
                response.sendRedirect("loginform.html");
                ps.close();
                conn.close();
            }catch(ClassNotFoundException |SQLException e){
                e.printStackTrace();
            }
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
