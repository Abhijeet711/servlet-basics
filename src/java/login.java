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

/**
 *
 * @author Abhi
 */
public class login extends HttpServlet {

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
        String r2 = request.getParameter("email");
        String r4 = request.getParameter("pass");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><style>body{background-color: palevioletred;font-size: 20px;} legend{font-weight: bold;} input{ font-size: 20px; border:1px solid #004080} label{font-weight: bold;} th, td{ padding: 15px; }</style>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                String sql = "SELECT id FROM reg1 where email=? and password=?";
                PreparedStatement ps = conn.prepareCall(sql);
                ps.setString(1, r2);
                ps.setString(2, r4);
                ResultSet rs;
                rs = ps.executeQuery();
                String id = null;
                while(rs.next()){
                    id = rs.getString("id");
                }
                if(id!=null){
                    out.println("login successful for user " + r2);
                    response.sendRedirect("loginsuccess.html");
                    
                }else{
                    out.println("login failed");
                    response.sendRedirect("loginfail.html");
                }
            }catch(ClassNotFoundException | SQLException e){
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
