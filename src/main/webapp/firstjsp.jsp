<%--
  Created by IntelliJ IDEA.
  User: danil
  Date: 02.02.2024
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>HO-HO-HO</h1>

    <%@ page import="java.util.Date, java.time.Clock" %>
    <%
        Date now = new Date();
        String nowDate = "Текущая дата: " + now;
    %>

    <%=nowDate%>

    <%
        for (int i =0; i<10;i++){
            out.println("<p>Hi: " + i + "</p>");
        }
    %>
</body>
</html>
