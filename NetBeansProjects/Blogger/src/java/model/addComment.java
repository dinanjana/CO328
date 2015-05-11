/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import control.filehandlers.FileHandler;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dinanajana
 */
public class addComment extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
    
        String URL = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\comments\\unreferredcomments\\";
        
        String blog = request.getParameter("blogname");
        String comment = request.getParameter("comment");
        
       // System.out.println(blog + comment);
        
        URL = URL + blog;
        
        Date date = new Date();
        FileHandler handler = new FileHandler(URL);
        handler.content = "<br>"+comment +"@ "+date.toString();
        handler.FileWriter();
        
        PrintWriter out = response.getWriter();
        out.println("<h4>Your comment will appear after an user approve :)<h4>");
    
    }
    
}













