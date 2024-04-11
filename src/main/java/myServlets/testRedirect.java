package myServlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "testRedirect", value = "/testRedirect")
public class testRedirect extends HttpServlet {
    /**
     * Redirect - перенаправляет пользователя на другую страницу, может и на внешнюю.
     * Изменения происходят на стороне пользователя
     * @see testForward
     * */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("https://yandex.ru"); //По ссылке
        //response.sendRedirect("/firstjsp.jsp"); //На файл
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}