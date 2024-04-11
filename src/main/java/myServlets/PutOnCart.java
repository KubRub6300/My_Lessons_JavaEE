package myServlets;

import addationalClass.Cart;
import addationalClass.Product;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PutOnCart", value = "/PutOnCart")
public class PutOnCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName  = request.getParameter("productName");
        Integer productPrice  = Integer.valueOf(request.getParameter("productPrice"));
        Integer countProduct = Integer.valueOf(request.getParameter("countProduct"));
        if (productPrice == null) productPrice = 0;
        if (countProduct == null) countProduct = 0;

        Product product = new Product(productName,productPrice);

        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart==null) cart = new Cart();

        cart.putOnCart(product,countProduct);

        session.setAttribute("cart",cart);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/showCart.jsp");
        dispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}