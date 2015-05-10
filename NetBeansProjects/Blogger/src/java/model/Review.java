/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import control.filehandlers.FileHandler;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Dinanajana
 */
public class Review extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String URL = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\content\\unrefferredContent\\";
        PrintWriter out = response.getWriter();
        FileHandler reviewed;
        
        
        out.println("<html>");
	out.println("<head><title>Review</title></head>");
        out.println("<body><h1>Review</h1>");
        out.println("<form method =\"POST\" action =\"review\"");
        
        File folder = new File(URL);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                
                String fileName = listOfFiles[i].getName();
                System.out.println("File " + fileName);
                out.println("<h2>Blog: </h2><p>" + fileName + "</p>");
                reviewed = new FileHandler(URL + fileName);
                reviewed.FileReader();
                out.println("<p>"+reviewed.content+"<p>");
                
                out.println("<div><input type =\"checkbox\" name =\"posts\" value =\""+fileName+"\"></div>");
                
            
            } else if (listOfFiles[i].isDirectory()) {
        
            System.out.println("Directory " + listOfFiles[i].getName());
            
            }
            
        }
        
        out.println("<div><input type =\"submit\" value =\"Reviewed\"></div>");
	//out.println("<h2>Blog: </h2><p>" + content + "</p>");
        out.println("</form></body>");
        out.println("</html>");
    
    }
    
}
