import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhi
 */
public class HttpSession1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Create or retrieve the HttpSession object from the request
        HttpSession session = request.getSession();

        // Check if it's a new session
        boolean isNewSession = session.isNew();

        // Get the session ID
        String sessionId = session.getId();

        // Get the session creation time
        long creationTime = session.getCreationTime();

        // Set some session attributes
        session.setAttribute("username", "Abhijeet");
        session.setAttribute("email", "abhijeet.b@somaiya.edu");

        // Invalidate the session after 5 minutes of inactivity
        session.setMaxInactiveInterval(5 * 60); // 5 minutes

        // Set the response content type
        response.setContentType("text/html");

        // Write the HTML response
        out.println("<html><head><link rel='stylesheet' href='styles.css'></head><body>");

        out.println("<h2>Session Tracking using HttpSession</h2>");
        out.println("<p>Session ID: " + sessionId + "</p>");
        out.println("<p>Session Creation Time: " + creationTime + "</p>");
        out.println("<p>New Session?: " + isNewSession + "</p>");

        out.println("<p>Session Attributes:</p>");
        out.println("<ul>");
        out.println("<li>Username: " + session.getAttribute("username") + "</li>");
        out.println("<li>Email: " + session.getAttribute("email") + "</li>");
        out.println("</ul>");

        out.println("</body></html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
