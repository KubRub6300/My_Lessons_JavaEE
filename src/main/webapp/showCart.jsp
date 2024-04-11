<%@ page import="addationalClass.Cart" %><%--
  Created by IntelliJ IDEA.
  User: danil
  Date: 04.02.2024
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your cart</title>
</head>
<body>
<%
    Cart cart  = (Cart)session.getAttribute("cart");
    System.out.println(cart);
    out.println(cart);
%>
</body>
</html>
