<%-- 
    Document   : Blogs
    Created on : May 10, 2015, 1:05:16 PM
    Author     : Dinanajana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>blogs</title>
    </head>
    <body>
        <h1>These are the available blogs</h1>
        
        <%
            //show the result here by extracting the attribute you set

        String result = (String) request.getAttribute("result");
        %>
        <p><%=result%></p>
    </body>
</html>
