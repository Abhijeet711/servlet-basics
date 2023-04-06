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
public class calc extends HttpServlet {

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
            throws ServletException, IOException, NumberFormatException {
//        response.setContentType("text/html;charset=UTF-8");
//        int n1 = Integer.parseInt(request.getParameter("n1"));
//        int n2 = Integer.parseInt(request.getParameter("n2"));
//        String op = request.getParameter("op");
//        int result=0;
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Calculator</title>");
//            out.println("<script></script>");
//            out.println("</head>");
//            out.println("<body style=\"margin:auto; width: 360px; height: 200px; margin-top:20px; padding-top:20px; border:2px solid black; font-size: 20px;\">");
//            //out.println("<h1>Servlet calc at " + request.getContextPath() + "</h1>");
//            out.println("number 1: " + n1 + "<br>");
//            out.println("number 2: " + n2 + "<br>");
//            out.println("selected arithmetic operation is: " + op);
//            if(op.equals("+")){
//                result=n1+n2;
//            }
//            else if(op.equals("*")){
//                result=n1*n2;
//            }
//            else if(op.equals("-")){
//                result=n1-n2;
//            }
//            else if(op.equals("/")){
//                result=n1/n2;
//            }
//            else if(op.equals("%")){
//                result = n1%n2;
//            }
//            out.println("<div>output is: " + result);
//            out.println("</div></body>");
//            out.println("</html>");
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
            throws ServletException, IOException, NumberFormatException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        String op = request.getParameter("op");
        int result=0;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><link rel=\"stylesheet\" href=\"styles.css\">");
            out.println("<title>Servlet Calculator</title></head>");
            out.println("<body><center>");
            out.println("<h1 id='heading'>Output</h1></center>");
            //out.println("<h1>Servlet calc at " + request.getContextPath() + "</h1>");
            out.println("<fieldset>number 1: " + n1 + "<br>");
            out.println("number 2: " + n2 + "<br>");
            out.println("selected arithmetic operation is: " + op);
            switch (op) {
                case "+":
                    result=n1+n2;
                    break;
                case "*":
                    result=n1*n2;
                    break;
                case "-":
                    result=n1-n2;
                    break;
                case "/":
                    result=n1/n2;
                    break;
                case "%":
                    result = n1%n2;
                    break;
            }
            out.println("<div>output is: " + result + "</div></fieldset></body></html>");
        }
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
