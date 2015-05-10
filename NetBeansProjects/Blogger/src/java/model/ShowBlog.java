/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import control.filehandlers.FileHandler;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dinanajana
 */
public class ShowBlog extends HttpServlet {
    
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String URL = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\content\\refferredContent\\";
        String blogName = request.getParameter("blog");
        URL = URL + blogName ;
        
        FileHandler handler = new FileHandler(URL);
        handler.FileReader();
        
        String blog = "<h1>"+blogName+"</h1><p>"+handler.content+"</p>";
        
        response.setContentType("text/html");
        request.setAttribute("result", blog);
        request.getRequestDispatcher("Blogs.jsp").forward(request, response);
    }
}
