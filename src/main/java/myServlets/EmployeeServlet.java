package myServlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");//Подключение драйвера
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mylessonsjava",
                "postgres","852456");){

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM employee");

            while (rs.next()){
                pw.println("<p>" + rs.getString("first_name") + " " + rs.getString("last_name") + "</p>");
            }

        } catch (SQLException e) {
            System.out.println("[ERROR] Ошибка подключения к БД!");;
        }

        pw.println("</html>");




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}