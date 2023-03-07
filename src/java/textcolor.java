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
 * @author studentadmin
 */
public class textcolor extends HttpServlet {

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
            throws ServletException, IOException{
//        response.setContentType("text/html;charset=UTF-8");
//        String s0 = request.getParameter("text");
//        String s1 = request.getParameter("bgc");
//        int s2 = Integer.parseInt(request.getParameter("fsz"));
//        String s3 = request.getParameter("fc");
//        String s4 = request.getParameter("ff");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html><head><title>Servlet textcolor</title>");
//            out.println("<style>div{\n"
//                    + "    background-color:"+s1+";\n"
//                    + "    font-size:"+s2+"px;\n"
//                    + "    color:"+s3+";\n"
//                    + "    font-family:"+s4+";\n"
//                    + "border: 2px solid black; border-radius:5px; margin:auto; height:auto; width:fit-content;}</style></head>");
//            out.println("<body><br>your text is: " + s0 + "<br>");
//            out.println("you have selected this background color: " + s1 + "<br>");
//            out.println("you have selected this font size: " + s2 + "<br>");
//            out.println("you have selected this font color: " + s3 + "<br>");
//            out.println("you have selected this font family: " + s4 + "<br>");
//            out.println("<br><br>");
//            out.println("<div>"+s0+"</div>");
//            out.println("</body></html>");
//        }
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
            throws ServletException, IOException, NumberFormatException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String s0 = request.getParameter("text");
        String s1 = request.getParameter("bgc");
        int s2 = Integer.parseInt(request.getParameter("fsz"));
        String s3 = request.getParameter("fc");
        String s4 = request.getParameter("ff");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Servlet textcolor</title>");
            out.println("<style>div{\n"
                    + "    background-color:"+s1+";\n"
                    + "    font-size:"+s2+"px;\n"
                    + "    color:"+s3+";\n"
                    + "    font-family:"+s4+";\n"
                    + "border: 2px solid black; border-radius:5px; margin:auto; height:auto; width:fit-content;}</style></head>");
            out.println("<body><br>your text is: " + s0 + "<br>");
            out.println("you have selected this background color: " + s1 + "<br>");
            out.println("you have selected this font size: " + s2 + "<br>");
            out.println("you have selected this font color: " + s3 + "<br>");
            out.println("you have selected this font family: " + s4 + "<br>");
            out.println("<br><br>");
            out.println("<div>"+s0+"</div>");
            out.println("</body></html>");
        }
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
