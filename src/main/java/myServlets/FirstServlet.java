package myServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        Integer countVisits = (Integer) session.getAttribute("countVisits");
        if (countVisits == null) countVisits = 0;

        session.setAttribute("countVisits",++countVisits);
        String userName = request.getParameter("name");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1> Hi, BRO! </h1>");
        pw.println("<p>Your name is: " + userName + "</p>");
        pw.println("<p>Your visit count this page: " + countVisits + "</p>" );
        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}