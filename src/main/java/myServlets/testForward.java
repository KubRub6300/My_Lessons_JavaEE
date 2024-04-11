package myServlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "testForward", value = "/testForward")
public class testForward extends HttpServlet {
    /**
     * Forward - перенаправляет пользователя на другую страницу, не может на внешнюю.
     * У пользователя остаётся та же ссылка, просто обработка страницы уходит на другой сервлет.
     * И этому сервлету передаются т же request и response
     * Изменения происходят на стороне сервера
     * @see testRedirect
     * */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/hi");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}