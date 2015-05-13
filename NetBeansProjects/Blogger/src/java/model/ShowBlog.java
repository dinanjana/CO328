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
        String comments ="C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\comments\\referrdecomments\\";
        
        String blogName = request.getParameter("blog");
        String person = request.getParameter("User");
        
        URL = URL + blogName + ".txt" ;
        comments = comments + blogName + ".txt";
        
        FileHandler handler = new FileHandler(URL);
        FileHandler handler2 = new FileHandler(comments);
        
        handler.FileReader();
        handler2.FileReader();
        
        String [] name = blogName.split("\\.");
        
        String cmnts ="<p>"+handler2.content+"<p>";
        
        if(person.equals("user")){
            
            
            String blog = "<textarea name=\"title\" cols=\"100\" rows=\"1\">"+name[0]+
                    "</textarea><p><textarea name=\"content\" cols=\"100\" rows=\"20\">"+
                    handler.content+"</textarea></p>";
            
            response.setContentType("text/html");
            request.setAttribute("result", blog);
            request.setAttribute("blog", blogName);
            request.setAttribute("comment", cmnts);
            request.getRequestDispatcher("\\Edit\\editBlog.jsp").forward(request, response);
        
        }else{
        
            String blog = "<h1>"+name[0]+"</h1><p>"+handler.content+"</p>";
            response.setContentType("text/html");
            request.setAttribute("result", blog);
            request.setAttribute("blog", blogName);
            request.setAttribute("comment", cmnts);
            request.getRequestDispatcher("ShowBlog.jsp").forward(request, response);
            
        }
        
        
        
        
       // System.out.println(blog + cmnts + "  ShowBlog");
        
        
       
    }
}
