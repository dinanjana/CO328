/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import control.filehandlers.FileHandler;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dinanajana
 */
public class addBlog extends HttpServlet {
    
    String remv = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\content\\unrefferredContent\\";
    String add = "C:\\Users\\Dinanajana\\Documents\\NetBeansProjects\\Blogger\\src\\java\\content\\refferredContent\\";
    String [] newBlogs;
    
    
    
   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response){
       
       newBlogs = request.getParameterValues("posts");
       
       if(newBlogs.length > 0){
           for (String newBlog : newBlogs) {
               
               FileHandler handler = new FileHandler(remv);
               System.out.println(newBlog);
               
               String remvFile = remv + newBlog;
               String addFile = add + newBlog;
               
               handler.copyFile(remvFile, addFile);
               
               handler.deleteContent(remvFile);
           }
       }
   
   } 
    
}
