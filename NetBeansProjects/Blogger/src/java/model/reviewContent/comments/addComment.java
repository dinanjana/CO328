/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.reviewContent.comments;

import control.filehandlers.FileHandler;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dinanajana
 */
public class addComment extends HttpServlet{
    
    String remv = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\comments\\unreferredcomments\\";
    String add = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\comments\\referrdecomments\\";
    String [] newComments;
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
    
        newComments = request.getParameterValues("comments");
       
       if(newComments.length > 0){
           for (String newBlog : newComments) {
               
               FileHandler handler = new FileHandler(remv);
               System.out.println(newBlog);
               
               //Rb.addRecent(newBlog);
               
               String remvFile = remv + newBlog;
               String addFile = add + newBlog;
               
               handler.copyFile(remvFile, addFile);
               
               handler.deleteContent(remvFile);
           }
       }
   
    
    
    }
    
}
