package myServlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetCookiesServlet", value = "/GetCookiesServlet")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        for (Cookie cookie : cookies){
            pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
        }
        pw.println("<h1>Domain: "  + cookies[0].getDomain() + "</h1>");
        pw.println("<h1>Path: "  + cookies[0].getPath() + "</h1>");
        pw.println("<h1>MaxAge: "  + cookies[0].getMaxAge() + "</h1>");
        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}