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
        String result2 = (String) request.getAttribute("blog");
        String comment = (String) request.getAttribute("comment");
        %>
        <p><%=result%></p>
        <br><br><br>
        <p><h3>Comments:</h3><p>
        <p><%=comment%><p>
        
        <form method="POST" action ="new_comment">
            
            Comment:<textarea name="comment" cols="50" rows="3"></textarea>
            <input type="hidden" name="blogname" value="<%=result2%>">
            <input type="submit" value="Add Comment">
            
        </form>
    </body>
</html>
