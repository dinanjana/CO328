/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import control.filehandlers.FileHandler;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Dinanajana
 */
public class AddContent extends HttpServlet {
    
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String title ;
        String content ;
        title = request.getParameter("title");
        content = request.getParameter("content");
        
        String URL = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\content\\unrefferredContent\\"+title+".txt"; 
        
        FileHandler newPost = new FileHandler(URL);
        
        newPost.content = content;
        
        newPost.FileWriter();
        
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
	out.println("<head><title>"+title+"</title></head>");
        out.println("<body><h1>"+title+"</h1>");
	out.println("<p>" + content + "</p>");
        out.println("</body>");
        out.println("</html>");
    
    }
}
