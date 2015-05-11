<%-- 
    Document   : Blogs
    Created on : May 11, 2015, 5:08:39 PM
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
        <h1>These are the available blogs.You can view and edit content here </h1>
        
        <%
            //show the result here by extracting the attribute you set

        String result = (String) request.getAttribute("result");
        
        
        
        %>
        <p><%=result%></p>
    </body>
</html>
