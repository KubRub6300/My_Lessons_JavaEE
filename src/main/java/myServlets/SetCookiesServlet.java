package myServlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SetCookiesServlet", value = "/SetCookiesServlet")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", "123");
        Cookie cookieName = new Cookie("name", "someName");
        cookie.setMaxAge(60 * 60 * 24);//Установка времени хранения в секундах
        cookieName.setMaxAge(60 * 60 * 24);
        //cookieName.setMaxAge(-1); //Cookies будут удалены после закрытия браузера
        response.addCookie(cookie);
        response.addCookie(cookieName);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}