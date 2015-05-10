<%-- 
    Document   : ShowBlog
    Created on : May 10, 2015, 1:50:17 PM
    Author     : Dinanajana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShowBlog</title>
    </head>
    <body>
        <h1>Blog</h1>
        <%
            //show the result here by extracting the attribute you set

        String result = (String) request.getAttribute("result");
        %>
        <p><%=result%></p>
    </body>
</html>
